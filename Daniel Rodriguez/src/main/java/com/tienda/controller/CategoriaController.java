package com.tienda.controller;

import com.tienda.service.CategoriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        try {
            var categorias = categoriaService.getCategorias(false);
            model.addAttribute("categorias", categorias);
            model.addAttribute("totalCategorias", categorias.size());
            return "categoria/listado";
        } catch (Exception e) {
            log.error("Error al obtener las categorías", e);
            // Puedes redirigir a una página de error o manejarlo de otra manera según tus necesidades.
            return "error";
        }
    }
}
