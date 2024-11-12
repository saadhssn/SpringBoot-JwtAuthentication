package com.internode_studios.spring_boot_application.auth;

import com.internode_studios.spring_boot_application.User.dto.UserDto;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Transactional
public class AuthenticationResponse {

    private String token;
    private UserDto user; // Include user details in the response
}
