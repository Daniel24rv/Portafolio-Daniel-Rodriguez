<<<<<<< HEAD
package com.tienda.controller;


import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import com.tienda.service.impl.FirebaseStorageServiceImpl;
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.demo.controller;

import tienda.demo.service.categoriaService;
import lombok.extern.slf4j.Slf4j;
>>>>>>> parent of 44e3fb4 (semana 7.1)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

=======
>>>>>>> parent of 44e3fb4 (semana 7.1)
@Controller
@RequestMapping("/categoria")
<<<<<<< HEAD
public class CategoriaController {
  
    @Autowired
    private CategoriaService categoriaService;
    
=======
public class categoriaController {
    @Autowired
    private categoriaService categoriaService;

>>>>>>> parent of 44e3fb4 (semana 7.1)
    @GetMapping("/listado")
    private String listado(Model model) {
        var categorias = categoriaService.getCategorias(false);
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalCategorias",categorias.size());
        return "/categoria/listado";
    }
<<<<<<< HEAD
    
     @GetMapping("/nuevo")
    public String categoriaNuevo(Categoria categoria) {
        return "/categoria/modifica";
    }

    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @PostMapping("/guardar")
    public String categoriaGuardar(Categoria categoria,
            @RequestParam("imagenFile") MultipartFile imagenFile) {        
        if (!imagenFile.isEmpty()) {
            categoriaService.save(categoria);
            categoria.setRutaImagen(
                    firebaseStorageService.cargaImagen(
                            imagenFile, 
                            "categoria", 
                            categoria.getIdCategoria()));
        }
        categoriaService.save(categoria);
        return "redirect:/categoria/listado";
    }

    @GetMapping("/eliminar/{idCategoria}")
    public String categoriaEliminar(Categoria categoria) {
        categoriaService.delete(categoria);
        return "redirect:/categoria/listado";
    }

    @GetMapping("/modificar/{idCategoria}")
    public String categoriaModificar(Categoria categoria, Model model) {
        categoria = categoriaService.getCategoria(categoria);
        model.addAttribute("categoria", categoria);
        return "/categoria/modifica";
    }   
}
=======
}
>>>>>>> parent of 44e3fb4 (semana 7.1)
