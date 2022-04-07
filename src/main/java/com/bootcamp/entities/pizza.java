package com.bootcamp.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

    // Fotografía
    @NotEmpty(message = "La pizza debe tener una fotografía.")
    private String foto;

    // Ingredientes
    @NotEmpty(message = "Una pizza debe tener ingredientes.")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "ingrediente")
    private List<Ingrediente> ingredientes;

    // Atributo precio de la pizza con limitaciones
    @NotEmpty(message = "El campo precio no puede estar vacío.")
    @Min(value = 0, message = "El precio de un ingrediente no puede ser negativo.")
    private double precio;

    // Comentarios
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "comentario")
    private List<Comentario> comentarios;

    public Pizza() {
        super();
    }

    public Pizza(long id,
            @NotEmpty(message = "El campo nombre no puede estar vacío.") @Size(min = 3, max = 255, message = "El campo nombre debe tener entre 3 y 255 caracteres.") String nombre,
            @NotEmpty(message = "La pizza debe tener una fotografía.") String foto,
            @NotEmpty(message = "Una pizza debe tener ingredientes.") List<Ingrediente> ingredientes,
            @NotEmpty(message = "El campo precio no puede estar vacío.") @Min(value = 0, message = "El precio de un ingrediente no puede ser negativo.") double precio,
            List<Comentario> comentarios) {
        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
        this.ingredientes = ingredientes;
        this.precio = precio;
        this.comentarios = comentarios;
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

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

}
