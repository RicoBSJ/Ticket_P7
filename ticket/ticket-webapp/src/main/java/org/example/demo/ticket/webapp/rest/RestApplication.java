package org.example.demo.ticket.webapp.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class RestApplication extends ResourceConfig {

    public RestApplication() {
        packages("org.example.demo.ticket.webapp.rest");
    }
}
