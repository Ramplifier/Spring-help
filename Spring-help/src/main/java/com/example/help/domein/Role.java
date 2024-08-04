package com.example.help.domein;

import com.example.help.domein.enums.RoleEnum;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private RoleEnum name;


}