package com.factura.java.factura.dominio.modelo;

import java.time.LocalDateTime;

public class Factura {
    private Long id;
    private Cliente cliente;
    private LocalDateTime fecha;


    public Factura() {
    }

    public Factura(Long id, Cliente cliente, LocalDateTime fecha) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
