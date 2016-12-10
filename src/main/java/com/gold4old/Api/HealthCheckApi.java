package com.gold4old.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/healthcheck")
public interface HealthCheckApi {

    @GET
    boolean healthCheck();

}