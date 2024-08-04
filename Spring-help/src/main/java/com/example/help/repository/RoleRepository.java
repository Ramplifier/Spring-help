package com.example.help.repository;

import com.example.help.domein.Role;
import com.example.help.domein.enums.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByName(RoleEnum name);
}
