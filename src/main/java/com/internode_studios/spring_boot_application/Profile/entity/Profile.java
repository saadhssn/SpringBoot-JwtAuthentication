package com.internode_studios.spring_boot_application.Profile.entity;

import com.internode_studios.spring_boot_application.Customer.entity.Customer;
import com.internode_studios.spring_boot_application.User.entity.Role;
import com.internode_studios.spring_boot_application.User.entity.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "profiles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Profile {

    @Id
    private Long id;  // Use the same ID as the User

    private String first_name;
    private String last_name;
    private String username;
    private String email_address;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String profile_picture;
    private Boolean status;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "id")
    private User user;


}
