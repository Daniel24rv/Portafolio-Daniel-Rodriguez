<<<<<<< HEAD
package com.tienda.service.impl;

import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tienda.demo.service.impl;

import tienda.demo.dao.CategoriaDao;
import tienda.demo.domain.categoria;
import tienda.demo.service.categoriaService;
>>>>>>> parent of 44e3fb4 (semana 7.1)
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
<<<<<<< HEAD

@Service
public class CategoriaServiceImpl implements CategoriaService {

     @Autowired
=======
@Service
public class CategoriaServiceImpl implements categoriaService {
    @Autowired
>>>>>>> parent of 44e3fb4 (semana 7.1)
    private CategoriaDao categoriaDao;
    
    
    @Transactional(readOnly=true)
    @Override
    public List<categoria> getCategorias(boolean activos) {
        var lista=categoriaDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
<<<<<<< HEAD

    @Override
    @Transactional(readOnly = true)
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
    }
    
=======
>>>>>>> parent of 44e3fb4 (semana 7.1)
}
