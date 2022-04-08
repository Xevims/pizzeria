package com.bootcamp.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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

    // Pizza sobre la que se hace el comentario
    @NotEmpty(message = "El campo pizza no puede estar vacío.")
    @ManyToOne
    private Pizza pizza;

    // Usuario que hace el comentario
    @NotEmpty(message = "El campo usuario no puede estar vacío.")
    @ManyToOne
    private Usuario usuario;

    public Comentario() {
        super();
    }

    public Comentario(long id,
            @NotEmpty(message = "El campo email no puede estar vacío.") @Size(min = 4, max = 255, message = "El campo comentario debe tener entre 4 y 255 caracteres.") String texto,
            @NotEmpty(message = "El campo puntuación no puede estar vacío.") @Min(value = 0, message = "La puntuación debe estar entre 0 y 10.") @Max(value = 10, message = "La puntuación debe estar entre 0 y 10.") int puntuacion,
            @NotEmpty(message = "El campo fecha no puede estar vacío.") Date fecha,
            @NotEmpty(message = "El campo pizza no puede estar vacío.") Pizza pizza,
            @NotEmpty(message = "El campo usuario no puede estar vacío.") Usuario usuario) {
        this.id = id;
        this.texto = texto;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.pizza = pizza;
        this.usuario = usuario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
