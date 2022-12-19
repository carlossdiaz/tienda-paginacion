package com.cdiapua1107.tienda.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cdiapua1107.tienda.model.Cliente;

public interface ClientesService {
    public Page<Cliente> findAll(Pageable page);

    public Cliente findById(int codigo);

    public void insert(Cliente Producto);

    public void update(Cliente Producto);

    public void delete(int codigo);
}
