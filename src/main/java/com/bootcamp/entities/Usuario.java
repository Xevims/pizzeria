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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Usuario implements Serializable {

    // Atributo ID autoincremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Campo email con limitación de caracteres
    @NotEmpty(message = "El campo email no puede estar vacío.")
    @Size(min = 4, max = 255, message = "El campo email debe tener entre 4 y 255 caracteres.")
    private String email;

    // Atributo nombre limitado a dos caracteres para aceptar nombres de distintas
    // culturas.
    @NotEmpty(message = "El campo nombre no puede estar vacío.")
    @Size(min = 2, max = 255, message = "El campo nombre debe tener entre 2 y 255 caracteres.")
    private String nombre;

    // Atributo nombre limitado a dos caracteres para aceptar apellidos de distintas
    // culturas.
    @NotEmpty(message = "El campo apellidos no puede estar vacío.")
    @Size(min = 2, max = 255, message = "El campo apellidos debe tener entre 2 y 255 caracteres.")
    private String apellidos;

    // Atributo password con longitud mínima
    @NotEmpty(message = "El campo password no puede estar vacío.")
    @Size(min = 8, max = 255, message = "El campo password debe tener entre 8 y 255 caracteres.")
    private String passwd;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "usuario")
    private List<Comentario> comentarios;

    public Usuario() {
        super();
    }

    public Usuario(long id,
            @NotEmpty(message = "El campo email no puede estar vacío.") @Size(min = 4, max = 255, message = "El campo email debe tener entre 4 y 255 caracteres.") String email,
            @NotEmpty(message = "El campo nombre no puede estar vacío.") @Size(min = 2, max = 255, message = "El campo nombre debe tener entre 2 y 255 caracteres.") String nombre,
            @NotEmpty(message = "El campo apellidos no puede estar vacío.") @Size(min = 2, max = 255, message = "El campo apellidos debe tener entre 2 y 255 caracteres.") String apellidos,
            @NotEmpty(message = "El campo password no puede estar vacío.") @Size(min = 8, max = 255, message = "El campo password debe tener entre 8 y 255 caracteres.") String passwd,
            List<Comentario> comentarios) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.passwd = passwd;
        this.comentarios = comentarios;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

}
