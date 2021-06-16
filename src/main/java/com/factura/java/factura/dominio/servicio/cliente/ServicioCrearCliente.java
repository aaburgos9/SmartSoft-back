package com.factura.java.factura.dominio.servicio.cliente;

import com.factura.java.factura.dominio.modelo.Cliente;
import com.factura.java.factura.dominio.repositorio.ClienteRepositorio;

public class ServicioCrearCliente {

    private final ClienteRepositorio repositorio;

    public ServicioCrearCliente(ClienteRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void crear(Cliente cliente) {
        this.repositorio.crear(cliente);
    }

}
