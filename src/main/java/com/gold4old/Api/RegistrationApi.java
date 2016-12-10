package com.gold4old.Api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;

/**
 * Created by gourava on 01/01/16.
 */
@Path("/userdetails")
public interface RegistrationApi {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    OTP saveUserDetails(NewUserDetailsRequest newUserDetailsRequest) throws MalformedURLException, ServiceException;


    @PUT
    @Path("/activate")
    @Consumes(MediaType.APPLICATION_JSON)
    void setStatus(String mobileNumber);
}
