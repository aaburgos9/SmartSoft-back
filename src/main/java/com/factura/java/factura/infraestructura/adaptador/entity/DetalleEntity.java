package com.factura.java.factura.infraestructura.adaptador.entity;

import javax.persistence.*;

@Entity
@Table(name = "detalle_factura")
public class DetalleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne( cascade = CascadeType.REFRESH)
    private FacturaEntity factura;

    @ManyToOne( cascade = CascadeType.REFRESH)
    private ProductoEntity producto;


    private int cantidad;
    private Double precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FacturaEntity getFactura() {
        return factura;
    }

    public void setFactura(FacturaEntity factura) {
        this.factura = factura;
    }

    public ProductoEntity getProducto() {
        return producto;
    }

    public void setProducto(ProductoEntity producto) {
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
