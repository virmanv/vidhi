package com.gold4old.Api;

import com.gold4old.application.LoginApplication;
import com.gold4old.domain.model.user.PasswordMismatchException;
import com.gold4old.domain.model.user.User;
import com.gold4old.domain.model.user.UserNotFoundException;
import com.gold4old.infrastructure.user.RegisteredUserDetails;
import com.gold4old.infrastructure.user.UserNotActiveException;
import com.google.common.base.Strings;

import javax.annotation.Resource;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.core.Response;

public class LoginApiImpl implements LoginApi {

    @Resource
    private LoginApplication loginApplication;

    @Override
    public RegisteredUserDetails login(User user) {
        checkWebArgument(user != null, "Request cannot be null");
        checkWebArgument(user.getMobileNumber() != null, "mobile number cannot be null");
        checkWebArgument(user.getPassword() != null, "password cannot be null");
        checkWebArgument(!(user.getMobileNumber().trim().isEmpty()), "Mobile Number cannot be empty");
        checkWebArgument(!(user.getPassword().trim().isEmpty()), "Password cannot be empty");
        RegisteredUserDetails registeredUserDetails = null;

        try {
            registeredUserDetails = loginApplication.login(user);

        } catch (UserNotActiveException e) {
            throw new ClientErrorException(Response.status(Response.Status.PRECONDITION_FAILED).build(), e);

        } catch (PasswordMismatchException e) {
            throw new ClientErrorException(Response.status(Response.Status.UNAUTHORIZED).build(), e);

        } catch (UserNotFoundException e) {
            throw new ClientErrorException(Response.status(Response.Status.NOT_FOUND).build(), e);

        }
        return registeredUserDetails;
    }

    public static void checkWebArgument(boolean assertion, String message) {
        if (!assertion) {
            try {
                throw new BadRequestException();
            } catch (Exception e) {
                throw e;
            }
        }
    }

    public static void checkNotNullOrEmpty(String reference, String message) {
        if (reference != null) {
            reference = reference.trim();
        }
        checkWebArgument(!Strings.isNullOrEmpty(reference), message);
    }
}
