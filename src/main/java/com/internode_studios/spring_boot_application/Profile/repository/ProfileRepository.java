package com.internode_studios.spring_boot_application.Profile.repository;

import com.internode_studios.spring_boot_application.Profile.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
