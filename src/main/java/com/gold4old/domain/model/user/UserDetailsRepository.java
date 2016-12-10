package com.gold4old.domain.model.user;

import com.gold4old.infrastructure.user.RegisteredUserDetails;

import java.util.List;

public interface UserDetailsRepository {

    void saveUserDetails(User user);

    List<RegisteredUserDetails> getUserDetails(User user);

    void updateUserDetails(User user);

    void updateStatusForUser(String mobileNumber);
}
