package com.factura.java.factura.aplicacion.comando;

public class ProductoComando {
    private Long id;
    private String nombre;
    private Double precio;
    private int stock;

    public ProductoComando() {
    }

    public ProductoComando(Long id, String nombre, Double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
}
