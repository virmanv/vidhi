package com.gold4old.application;

import com.gold4old.Api.OTP;
import com.gold4old.Api.SendSms;
import com.gold4old.domain.model.user.User;
import com.gold4old.domain.model.user.UserDetailsRepository;
import com.gold4old.infrastructure.user.RegisteredUserDetails;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

public class RegistrationApplicationImpl implements RegistrationApplication {

    @Resource
    private UserDetailsRepository userDetailsRepository;

    @Override
    public OTP saveUserDetails(User user) {

        List<RegisteredUserDetails> userDetails = userDetailsRepository.getUserDetails(user);
        OTP otp = new OTP();
        int generatedOtp = generateRandomInteger();

        SendSms sendSms = new SendSms();

        if (userDetails.isEmpty()) {

            userDetailsRepository.saveUserDetails(user);
            List<RegisteredUserDetails> registeredUserDetailsList = userDetailsRepository.getUserDetails(user);
            int id = registeredUserDetailsList.get(0).getId();
            otp.setOtp(generatedOtp);
            try {
                sendSms.createSoapClient(user.getMobileNumber(), id, generatedOtp);
            } catch (Exception e) {

            }
        } else if (!(userDetails.get(0).getStatus().equalsIgnoreCase("active"))) {

            userDetailsRepository.updateUserDetails(user);
            List<RegisteredUserDetails> registeredUserDetailsList = userDetailsRepository.getUserDetails(user);
            int id = registeredUserDetailsList.get(0).getId();
            otp.setOtp(generatedOtp);

            try {
                sendSms.createSoapClient(user.getMobileNumber(), id, generatedOtp);
            } catch (Exception e) {

            }

        }
        return otp;
    }

    @Override
    public void updateUserDetails(String mobileNumber) {
        userDetailsRepository.updateStatusForUser(mobileNumber);
    }

    private int generateRandomInteger() {

        Random randomGenerator = new Random();
        int randomInt = 0;
        randomInt = randomGenerator.nextInt(10000);
        return randomInt;
    }
}
