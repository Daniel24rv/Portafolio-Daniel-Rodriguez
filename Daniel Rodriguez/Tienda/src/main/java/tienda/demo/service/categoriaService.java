package com.tienda.service;

<<<<<<< HEAD
import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    public List<Categoria> getCategorias(boolean activo);

    // Se obtiene un Categoria, a partir del id de un categoria
    public Categoria getCategoria(Categoria categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Categoria categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
=======
package tienda.demo.service;

import tienda.demo.domain.categoria;
import java.util.List;

public interface categoriaService {
    // Se obtiene un listado de categorias en un List
    public List<categoria> getCategorias(boolean activos);
>>>>>>> parent of 44e3fb4 (semana 7.1)
}
