package com.learning;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HeaderPropagator {

    private ThreadLocal<String> header;

    public HeaderPropagator() {
        this.header = new ThreadLocal<>();
    }

    public String getHeaderValue() {
        return header.get();
    }

    public void setHeaderValue(final String headerValue){
        header.set(headerValue);
    }
}
