/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.demo.service;

import tienda.demo.domain.categoria;
import java.util.List;

public interface categoriaService {
    // Se obtiene un listado de categorias en un List
    public List<categoria> getCategorias(boolean activos);
}
