package com.learning;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

@Path("/resource2")
public class Resource2 {
    @Inject
    Service service;

    @Context
    HttpHeaders headers;

    @Produces
    @Named("resource2")
    public HttpHeaders headersFactory(){
        return headers;
    }

    @GET
    public String value2(){
        return service.getHeaderValue();
    }
}
