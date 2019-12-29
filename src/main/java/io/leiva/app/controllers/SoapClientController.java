package io.leiva.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.leiva.app.soap.SoapClient;

@RestController
@RequestMapping("/num2words")
public class SoapClientController {

    @Autowired
    private SoapClient soapClient;

    @GetMapping("/{numero}")
    public String convertirNumeroPalabras(@PathVariable("numero") Long numero) {
        return soapClient.convertirNumeroPalabras(numero);
    }

}
