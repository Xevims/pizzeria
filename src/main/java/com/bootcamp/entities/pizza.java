package com.bootcamp.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Pizza implements Serializable {

    private long id;
    private String nombre;
    // aquí va la foto
    private String ingredientes;
    private long precio;

}
