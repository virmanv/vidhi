package com.gold4old.application;

import com.gold4old.Api.OTP;
import com.gold4old.domain.model.user.User;


public interface RegistrationApplication {

    OTP saveUserDetails(User user);

    void updateUserDetails(String mobileNumber);
}
