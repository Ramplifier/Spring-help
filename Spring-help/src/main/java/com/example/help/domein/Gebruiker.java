package com.example.help.domein;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@Builder
/*
All args is het zelfde als een constructor die alle parameters heeft
no-args constructor is een zonder parameters.
Lombok is een dependency die heel veel boiler plate code voor je maakt
dus de no-args constructor annotatie maakt de een constructor voor je aan als je het project build.
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Gebruiker {


    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Size(max = 50)
    private String username;

    @NotBlank
    private String wachtwoord;

    @Email
    private String emailadres;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "gebruiker_roles",
            joinColumns = @JoinColumn(name = "gebruiker_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    @ToString.Exclude
    private Set<Role> roles = new HashSet<>();


    //En eigenschappen die een acount nog meer nodig heeft

}
