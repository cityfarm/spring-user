package com.sifu.learnsb.mapper;

import com.sifu.learnsb.dto.request.UserCreationRequest;
import com.sifu.learnsb.dto.request.UserUpdateRequest;
import com.sifu.learnsb.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-24T23:11:34+0700",
    comments = "version: 1.6.2, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(UserCreationRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setName( request.getName() );
        user.setBirthday( request.getBirthday() );
        user.setSalary( request.getSalary() );
        user.setUsername( request.getUsername() );
        user.setPassword( request.getPassword() );

        return user;
    }

    @Override
    public UserUpdateRequest toUserUpdateRequest(User user) {
        if ( user == null ) {
            return null;
        }

        UserUpdateRequest.UserUpdateRequestBuilder userUpdateRequest = UserUpdateRequest.builder();

        userUpdateRequest.name( user.getName() );
        userUpdateRequest.birthday( user.getBirthday() );
        userUpdateRequest.salary( user.getSalary() );
        userUpdateRequest.password( user.getPassword() );

        return userUpdateRequest.build();
    }
}
