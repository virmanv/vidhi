package com.gold4old.application;

import com.gold4old.domain.model.user.User;
import com.gold4old.infrastructure.user.RegisteredUserDetails;

/**
 * Created by virmanv on 26/09/2016 October.
 */
public interface LoginApplication {
    RegisteredUserDetails login(User user);

}
