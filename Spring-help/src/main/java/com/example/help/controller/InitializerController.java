package com.example.help.controller;

import com.example.help.domein.Role;
import com.example.help.domein.enums.RoleEnum;
import com.example.help.repository.RoleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/initial")
@RestController
public class InitializerController {

    RoleRepository roleRepository;

    InitializerController(RoleRepository roleRes){
        roleRepository = roleRes;
    }

    @GetMapping("/database")
    public void initializeDatabase(){
        Role user = new Role();
        user.setName(RoleEnum.USER);
        roleRepository.save(user);

        Role admin = new Role();
        admin.setName(RoleEnum.ADMIN);
        roleRepository.save(admin);
    }

}
