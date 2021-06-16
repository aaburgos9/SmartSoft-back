package com.factura.java.factura.dominio.servicio.producto;

import com.factura.java.factura.dominio.modelo.Producto;
import com.factura.java.factura.dominio.repositorio.ProductoRepositorio;

public abstract class ServicioCrearProducto {

    private final ProductoRepositorio repositorio;

    public ServicioCrearProducto(ProductoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void crear(Producto producto) {
        this.repositorio.crear(producto);
    }


}
