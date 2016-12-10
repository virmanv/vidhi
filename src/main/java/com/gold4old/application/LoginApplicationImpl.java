package com.gold4old.application;

import com.gold4old.domain.model.user.PasswordMismatchException;
import com.gold4old.domain.model.user.User;
import com.gold4old.domain.model.user.UserDetailsRepository;
import com.gold4old.domain.model.user.UserNotFoundException;
import com.gold4old.infrastructure.user.RegisteredUserDetails;
import com.gold4old.infrastructure.user.UserNotActiveException;

import javax.annotation.Resource;
import java.util.List;

public class LoginApplicationImpl implements LoginApplication {

    @Resource
    private UserDetailsRepository userDetailsRepository;

    @Override
    public RegisteredUserDetails login(User user) {
        List<RegisteredUserDetails> registeredUserDetailsList = userDetailsRepository.getUserDetails(user);
        if(!registeredUserDetailsList.isEmpty()){
            if(user.getPassword().equals(registeredUserDetailsList.get(0).getPassword())){
                if(registeredUserDetailsList.get(0).getStatus().equals("active")){
                    return registeredUserDetailsList.get(0);
                }
                throw new UserNotActiveException("The status of user is not active");
            }
            throw new PasswordMismatchException("your password doesn't match our record");
        }

        throw new UserNotFoundException("User is not found in db");
    }
}
