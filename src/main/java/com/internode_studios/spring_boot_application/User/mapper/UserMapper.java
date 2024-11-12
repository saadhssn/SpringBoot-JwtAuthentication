package com.internode_studios.spring_boot_application.User.mapper;

import com.internode_studios.spring_boot_application.User.dto.UserDto;
import com.internode_studios.spring_boot_application.User.entity.Role;
import com.internode_studios.spring_boot_application.User.entity.User;

import java.sql.Date;

public class UserMapper {
    public static UserDto mapToUserDto(User user) {
        return new UserDto(
                user.getId(),
                user.getFirst_name(),
                user.getLast_name(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail_address(),
                user.getDob() != null ? new Date(user.getDob().getTime()) : null,
                user.getRole() != null ? user.getRole().name() : null,
                user.getPhone_number(),
                user.getCell_phone_number(),
                user.getProfile_picture(),
                user.getStatus()
        );
    }

    public static User mapToUser(UserDto userDto) {
        // Using builder to construct the User object
        return User.builder()
                .id(userDto.getId())
                .first_name(userDto.getFirst_name())
                .last_name(userDto.getLast_name())
                .username(userDto.getUsername())
                .password(userDto.getPassword())
                .email_address(userDto.getEmail_address())
                .dob(userDto.getDob() != null ? new java.util.Date(userDto.getDob().getTime()) : null)
                .role(userDto.getRole() != null ? Role.valueOf(userDto.getRole()) : null)
                .phone_number(userDto.getPhone_number())
                .cell_phone_number(userDto.getCell_phone_number())
                .profile_picture(userDto.getProfile_picture())
                .status(userDto.getStatus())
                // Profile is not set in this method, as it's usually created elsewhere
                .build();
    }
}
