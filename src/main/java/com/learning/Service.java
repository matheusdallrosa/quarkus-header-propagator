package com.learning;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Service {

    @Inject
    Gateway gateway;

    public String getHeaderValue(){
        return gateway.getHeaderValue();
    }
}
