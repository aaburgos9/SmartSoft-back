package com.factura.java.factura.aplicacion.comando;

import com.factura.java.factura.dominio.modelo.Cliente;

import java.time.LocalDateTime;

public class FacturaComando {
    private Long id;
    private Cliente cliente;
    private LocalDateTime fecha;

    public FacturaComando() {
    }

    public FacturaComando(Long id, Cliente cliente, LocalDateTime fecha) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
}
