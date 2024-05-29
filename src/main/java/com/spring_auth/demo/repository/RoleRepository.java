package com.spring_auth.demo.repository;

import java.util.Optional;

import com.spring_auth.demo.models.ERole;
import com.spring_auth.demo.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
