package com.sifu.learnsb.mapper;

import com.sifu.learnsb.dto.request.UserCreationRequest;
import com.sifu.learnsb.dto.request.UserUpdateRequest;
import com.sifu.learnsb.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserUpdateRequest toUserUpdateRequest(User user);
}
