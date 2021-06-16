package com.factura.java.factura.dominio.servicio.factura;

import com.factura.java.factura.dominio.modelo.Factura;
import com.factura.java.factura.dominio.repositorio.FacturaRepositorio;

public class ServicioCrearFactura {

    private final FacturaRepositorio repositorio;

    public ServicioCrearFactura(FacturaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public Factura crear(Factura factura) {
        return this.repositorio.crear(factura);
    }
}
