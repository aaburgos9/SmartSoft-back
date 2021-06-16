package com.factura.java.factura.aplicacion.comando;

import com.factura.java.factura.dominio.modelo.Factura;
import com.factura.java.factura.dominio.modelo.Producto;

public class DetalleComando {
    private Long id;
    private Factura factura;
    private Producto producto;
    private int cantidad;
    private Double precio;

    public DetalleComando() {
    }

    public DetalleComando(Long id, Factura factura, Producto producto, int cantidad, Double precio) {
        this.id = id;
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public Factura getFactura() {
        return factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Double getPrecio() {
        return precio;
    }
}
