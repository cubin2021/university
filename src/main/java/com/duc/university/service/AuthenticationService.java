package com.duc.university.service;

import com.duc.university.dto.JwtAuthenticationResponse;
import com.duc.university.dto.RefreshTokenRequest;
import com.duc.university.dto.SignInRequest;
import com.duc.university.dto.SignUpRequest;
import com.duc.university.entities.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signin(SignInRequest signInRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
