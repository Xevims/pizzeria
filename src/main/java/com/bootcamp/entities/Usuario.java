package com.bootcamp.entities;

import javax.persistence.Entity;

@Entity
public class Usuario {
    private long id;
    private String email;
    private String apellidos;
    private String passwd;

}
