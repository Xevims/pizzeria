package com.bootcamp.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Comentario {
    private long id;
    private String texto;
    private int puntuacion;
    private Date fecha;
    private String usuario;
    private String pizza;

}
