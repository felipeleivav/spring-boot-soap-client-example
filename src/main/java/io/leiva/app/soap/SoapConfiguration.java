package io.leiva.app.soap;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class SoapConfiguration {

    @Autowired
    private SoapClient client;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.dataaccess.webservicesserver");
        return marshaller;
    }

    @Bean
    public HttpComponentsMessageSender getMessageSender() {
        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
        messageSender.setCredentials(new UsernamePasswordCredentials("username", "password"));
        return messageSender;
    }

    @Bean
    public SoapClient soapClient(Jaxb2Marshaller marshaller) {
        client.setMessageSender(getMessageSender());
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
