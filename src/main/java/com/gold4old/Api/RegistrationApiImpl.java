package com.gold4old.Api;

import com.gold4old.application.RegistrationApplication;
import com.gold4old.domain.model.user.User;
import com.gold4old.domain.model.user.UserDetailsRepository;
import com.google.common.base.Strings;

import javax.annotation.Resource;
import javax.ws.rs.BadRequestException;
import java.util.Random;

public class RegistrationApiImpl implements RegistrationApi {

    @Resource
    private UserDetailsRepository userDetailsRepository;

    @Resource
    private RegistrationApplication registrationApplication;

    @Override
    public OTP saveUserDetails(NewUserDetailsRequest newUserDetailsRequest) {

        checkWebArgument(newUserDetailsRequest != null, "request cannot be null");
        checkWebArgument((newUserDetailsRequest.getMobileNumber() != null) && !(newUserDetailsRequest.getMobileNumber().trim().isEmpty()), "mobileNumber cannot be null or empty");
        checkWebArgument((newUserDetailsRequest.getEmail() != null) && !(newUserDetailsRequest.getEmail().trim().isEmpty()), "email cannot be null or empty");
        checkWebArgument((newUserDetailsRequest.getFullname() != null) && (newUserDetailsRequest.getFullname().trim().isEmpty()), "FullName cannot be null or empty");
        checkWebArgument((newUserDetailsRequest.getPassword() != null) && (newUserDetailsRequest.getPassword().trim().length() > 6), "password lenghth should be greater than 8");

        User user = new User();
        user.setName(newUserDetailsRequest.getFullname());
       // String password = Base64.encodeBase64String(newUserDetailsRequest.getPassword().getBytes());
       user.setPassword(newUserDetailsRequest.getPassword());
        user.setMobileNumber(newUserDetailsRequest.getMobileNumber());
        user.setEmail(newUserDetailsRequest.getEmail());
        OTP otp = null;
        try {
            otp = registrationApplication.saveUserDetails(user);

        }catch (Exception e){

        }
        return otp;
    }

    @Override
    public void setStatus(String mobileNumber) {
        checkNotNullOrEmpty(mobileNumber,"MobileNumber should not be null");
        checkWebArgument(!mobileNumber.isEmpty(),"MobileNumber should not be empty");
        registrationApplication.updateUserDetails(mobileNumber);

    }


    private int generateRandomInteger() {

        Random randomGenerator = new Random();
        int randomInt = 0;
        randomInt = randomGenerator.nextInt(10000);
        System.out.println(randomInt);
        return randomInt;

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
