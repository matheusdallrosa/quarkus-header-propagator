package com.learning;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

@Path("/resource2")
@ApplicationScoped
public class Resource2 {

    @Inject
    Service service;

    @Inject
    HeaderPropagator headerPropagator;

    @GET
    public String value2(@Context HttpHeaders headers) throws InterruptedException {
        headerPropagator.setHeaderValue(headers.getHeaderString("x-request-id"));
        return service.getHeaderValue();
    }
}
