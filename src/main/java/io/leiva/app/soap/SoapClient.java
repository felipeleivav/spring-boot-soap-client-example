package io.leiva.app.soap;

import java.math.BigInteger;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.dataaccess.webservicesserver.NumberToWords;
import com.dataaccess.webservicesserver.NumberToWordsResponse;

@Service
@Component("NumberConversion")
public class SoapClient extends WebServiceGatewaySupport {

    private String endpoint = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso?wsdl";

    public String convertirNumeroPalabras(Long numero) {
        NumberToWords request = new NumberToWords();
        request.setUbiNum(BigInteger.valueOf(numero));
        NumberToWordsResponse response = (NumberToWordsResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint,
                request);
        return response.getNumberToWordsResult();
    }

}
