package com.sifu.learnsb.service;

import com.sifu.learnsb.dto.request.AuthenticationRequest;
import com.sifu.learnsb.exception.AppException;
import com.sifu.learnsb.exception.ErrorCode;
import com.sifu.learnsb.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthenticationService {
    UserRepository userRepository;

    public boolean authenticate(AuthenticationRequest request) {
        var user = userRepository.findByUsername(request.getUsername())
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED));

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);

        System.out.println("Auth service called. Pass = " + request.getPassword());

        return passwordEncoder.matches(request.getPassword(), user.getPassword());
    }
}
