package com.gold4old.Api;

import com.gold4old.domain.model.user.User;
import com.gold4old.infrastructure.user.RegisteredUserDetails;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/user")
public interface LoginApi {

    @POST
    @Path("/login")
    @Consumes("application/json")
    @Produces("application/json")
    RegisteredUserDetails login(User user);


}
