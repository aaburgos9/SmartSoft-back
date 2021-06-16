package com.factura.java.factura.dominio.modelo;

public class Detalle {
    private Long id;
    private Factura factura;
    private Producto producto;
    private int cantidad;
    private Double precio;


    public Detalle() {
    }

    public Detalle(Long id, Factura factura, Producto producto, int cantidad, Double precio) {
        this.id = id;
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
