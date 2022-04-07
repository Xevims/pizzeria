package com.bootcamp.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Comentario implements Serializable {

    // Atributo ID autoincremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Atributo email con limitaciones
    @NotEmpty(message = "El campo email no puede estar vacío.")
    @Size(min = 4, max = 255, message = "El campo comentario debe tener entre 4 y 255 caracteres.")
    private String texto;

    // Atributo puntuación con limitaciones
    @NotEmpty(message = "El campo puntuación no puede estar vacío.")
    @Min(value = 0, message = "La puntuación debe estar entre 0 y 10.")
    @Max(value = 10, message = "La puntuación debe estar entre 0 y 10.")
    private int puntuacion;

    // Atributo fecha de comentario con limitaciones
    @NotEmpty(message = "El campo fecha no puede estar vacío.")
    private Date fecha;

    // Usuario que hace el comentario
    @NotEmpty(message = "El campo usuario no puede estar vacío.")
    private String usuario;

    // Pizza sobre la que se hace el comentario
    @NotEmpty(message = "El campo pizza no puede estar vacío.")
    private String pizza;

    public Comentario() {
        super();
    }

    public Comentario(long id,
            @NotEmpty(message = "El campo email no puede estar vacío.") @Size(min = 4, max = 255, message = "El campo comentario debe tener entre 4 y 255 caracteres.") String texto,
            @NotEmpty(message = "El campo puntuación no puede estar vacío.") @Min(value = 0, message = "La puntuación debe estar entre 0 y 10.") @Max(value = 10, message = "La puntuación debe estar entre 0 y 10.") int puntuacion,
            @NotEmpty(message = "El campo fecha no puede estar vacío.") Date fecha,
            @NotEmpty(message = "El campo usuario no puede estar vacío.") String usuario,
            @NotEmpty(message = "El campo pizza no puede estar vacío.") String pizza) {
        this.id = id;
        this.texto = texto;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.usuario = usuario;
        this.pizza = pizza;
    }

}
