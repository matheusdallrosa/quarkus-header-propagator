package com.learning;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

@Path("/resource")
@ApplicationScoped
public class Resource {

    @Inject
    Service service;

    @Inject
    HeaderPropagator headerPropagator;

    @GET
    public String value(@Context HttpHeaders headers) throws InterruptedException {
        headerPropagator.setHeaderValue(headers.getHeaderString("x-request-id"));
        Thread.sleep(10000);
        return service.getHeaderValue();
    }
}
