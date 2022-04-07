package com.bootcamp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Pizza implements Serializable {

    // Atributo ID autoincremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Atributo nombre requerido y con limitación de caracteres
    @NotEmpty(message = "El campo nombre no puede estar vacío.")
    @Size(min = 3, max = 255, message = "El campo nombre debe tener entre 3 y 255 caracteres.")
    private String nombre;

    // TODO - Fotografía
    @NotEmpty(message = "La pizza debe tener una fotografía.")
    private String foto;

    // Ingredientes
    @NotEmpty(message = "Una pizza debe tener ingredientes.")
    private String ingredientes;

    // Atributo precio de la pizza con limitaciones
    @NotEmpty(message = "El campo precio no puede estar vacío.")
    @Min(value = 0, message = "El precio de un ingrediente no puede ser negativo.")
    private double precio;

    public Pizza() {
        super();
    }

    public Pizza(long id,
            @NotEmpty(message = "El campo nombre no puede estar vacío.") @Size(min = 3, max = 255, message = "El campo nombre debe tener entre 3 y 255 caracteres.") String nombre,
            @NotEmpty(message = "La pizza debe tener una fotografía.") String foto,
            @NotEmpty(message = "Una pizza debe tener ingredientes.") String ingredientes,
            @NotEmpty(message = "El campo precio no puede estar vacío.") @Min(value = 0, message = "El precio de un ingrediente no puede ser negativo.") double precio) {
        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
