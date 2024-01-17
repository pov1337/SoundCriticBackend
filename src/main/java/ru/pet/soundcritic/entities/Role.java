package ru.pet.soundcritic.entities;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;

    private String role_name;
}
