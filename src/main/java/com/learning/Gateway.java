package com.learning;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Gateway {

    @Inject
    HeaderPropagator headerPropagator;

    public String getHeaderValue() {
        return headerPropagator.getHeaderValue();
    }
}
