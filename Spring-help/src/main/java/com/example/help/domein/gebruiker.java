package com.example.help.domein;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
public class gebruiker {
    @Id
    private Long id;

    @NonNull
    private String username;

    @NonNull
    private String password;

    private String emailAdres;

    //En eigenschappen die een acount nog meer nodig heeft

}
