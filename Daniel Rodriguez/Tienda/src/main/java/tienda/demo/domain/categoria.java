package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
<<<<<<< HEAD
@Table(name = "categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

=======
@Table(name="categoria")

public class categoria implements Serializable {
    
    private static final long serialVersionUID= 1L;
    
>>>>>>> parent of 44e3fb4 (semana 7.1)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

<<<<<<< HEAD
    @OneToMany
    @JoinColumn(name = "id_categoria", updatable = false)
    List<Producto> productos;

    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
=======
    public categoria() {
    }

    public categoria(String categoria, boolean activo) {
        this.descripcion = categoria;
>>>>>>> parent of 44e3fb4 (semana 7.1)
        this.activo = activo;
    }

}
