package com.cdiapua1107.tienda.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cdiapua1107.tienda.dao.ClientesDAO;
import com.cdiapua1107.tienda.model.Cliente;
import com.cdiapua1107.tienda.services.ClientesService;

@Service
public class ClienteServiceImpl implements ClientesService {

    @Autowired
    ClientesDAO clientesDAO;

    @Override
    public Page<Cliente> findAll(Pageable page) {
        return clientesDAO.findAll(page);
    }

    @Override
    public Cliente findById(int codigo) {
        return clientesDAO.findById(codigo);
    }

    @Override
    public void insert(Cliente cliente) {
        clientesDAO.insert(cliente);
    }

    @Override
    public void update(Cliente cliente) {
        clientesDAO.update(cliente);
    }

    @Override
    public void delete(int codigo) {
        clientesDAO.delete(codigo);
    }

}
