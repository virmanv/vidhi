package com.gold4old.infrastructure.user;

import com.gold4old.domain.model.user.User;
import com.gold4old.domain.model.user.UserDetailsRepository;
import com.gold4old.infrastructure.sql.KeyHolderFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.KeyHolder;

import javax.annotation.Resource;
import java.util.List;


public class UserDetailsRepositoryImpl implements UserDetailsRepository {

    @Resource
    private KeyHolderFactory keyHolderFactory;

    @Resource
    private NamedParameterJdbcOperations namedParameterJdbcTemplate;

    @Resource
    private RowMapper<RegisteredUserDetails> userRowMapper;


    private static final String INSERT_USERDETAILS = "insert into g4o_userDetails(email,password,mobileNumber,userFullName,status) values (:email,:password,:mobileNumber,:userFullName,:status)";

    private static final String SELECT_USERDETAILS ="select * from g4o_userDetails where mobileNumber =:mobilenumber ";

    private static final String UPDATE_USERDETAILS="UPDATE g4o_userDetails SET email =:email ,password =:password ,userFullName =:userFullName where mobileNumber =:mobilenumber";

    private static final String UPDATE_USER_STATUS="UPDATE g4o_userDetails SET status = 'active' where mobileNumber =:mobilenumber " ;
    @Override
    public void saveUserDetails(User user)  {

        KeyHolder keyHolder = keyHolderFactory.create();
        try{
            namedParameterJdbcTemplate.update(INSERT_USERDETAILS,createInsertSource(user),keyHolder);
        }catch (Exception e){
            throw  new Gold4OldRegistrationException("DB insertion error",e.getCause());
        }


    }

    @Override
    public List<RegisteredUserDetails> getUserDetails(User user) {
        List<RegisteredUserDetails> registeredUserDetails;
        registeredUserDetails =namedParameterJdbcTemplate.query(SELECT_USERDETAILS, new MapSqlParameterSource("mobilenumber", user.getMobileNumber()), userRowMapper);
        return registeredUserDetails;

    }

    @Override
    public void updateUserDetails(User user) {
        try{
            namedParameterJdbcTemplate.update(UPDATE_USERDETAILS,createInsertSource(user));

        }catch (Exception e){
            throw new Gold4OldRegistrationException("Problem while updating db");
        }
    }

    @Override
    public void updateStatusForUser(String mobileNumber) {
        try{
            namedParameterJdbcTemplate.update(UPDATE_USER_STATUS,new MapSqlParameterSource("mobilenumber", mobileNumber));
        }catch (Exception e){
            throw new Gold4OldRegistrationException("Problem while updating db");

        }
    }

    private SqlParameterSource createInsertSource(User user) {

        MapSqlParameterSource source = new MapSqlParameterSource();

        source.addValue("email", user.getEmail());
        source.addValue("password",user.getPassword());
        source.addValue("mobileNumber",user.getMobileNumber());
        source.addValue("userFullName",user.getName());
        source.addValue("status","inactive");

        return source;
    }

}
