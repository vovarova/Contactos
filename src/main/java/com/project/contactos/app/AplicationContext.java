package com.project.contactos.app;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class AplicationContext extends ResourceConfig {
    private static final String PACKAGE_SCAN = "com.project.contactos";

    public AplicationContext() {
        register(RequestContextFilter.class);
        packages(PACKAGE_SCAN);
    }
}