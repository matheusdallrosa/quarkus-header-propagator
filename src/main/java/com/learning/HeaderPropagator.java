package com.learning;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.ws.rs.core.HttpHeaders;

@RequestScoped
public class HeaderPropagator {

    private HttpHeaders headers;

    public HeaderPropagator(@Named("resource") HttpHeaders headers1, @Named("resource2") HttpHeaders headers2) {
        if(headers1 != null) this.headers = headers1;
        if(headers2 != null) this.headers = headers2;
    }

    public String getHeaderValue(final String headerName) {
        return headers.getRequestHeader(headerName).get(0);
    }
}
