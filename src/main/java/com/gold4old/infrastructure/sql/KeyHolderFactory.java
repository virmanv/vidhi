
package com.gold4old.infrastructure.sql;

import org.springframework.jdbc.support.KeyHolder;

public interface KeyHolderFactory {

    KeyHolder create();

}
