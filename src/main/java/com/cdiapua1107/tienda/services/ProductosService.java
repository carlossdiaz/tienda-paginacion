package com.cdiapua1107.tienda.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cdiapua1107.tienda.model.Producto;

public interface ProductosService {

    public Page<Producto> findAll(Pageable page);

    public Producto findById(int codigo);

    public void insert(Producto Producto);

    public void update(Producto Producto);

    public void delete(int codigo);
}
