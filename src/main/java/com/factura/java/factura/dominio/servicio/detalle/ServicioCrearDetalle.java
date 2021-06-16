package com.factura.java.factura.dominio.servicio.detalle;

import com.factura.java.factura.dominio.modelo.Detalle;
import com.factura.java.factura.dominio.repositorio.DetalleRepositorio;

public class ServicioCrearDetalle {

    private final DetalleRepositorio repositorio;

    public ServicioCrearDetalle(DetalleRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void crear(Detalle detalle) {
        this.repositorio.crear(detalle);
    }
}
