package com.factura.java.factura.aplicacion.manejador.cliente;

import com.factura.java.factura.aplicacion.comando.ClienteComando;
import com.factura.java.factura.aplicacion.fabrica.ClienteFactory;
import com.factura.java.factura.dominio.servicio.cliente.ServicioCrearCliente;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearCliente {

    private final ServicioCrearCliente servicio;

    public ManejadorCrearCliente(ServicioCrearCliente servicio) {
        this.servicio = servicio;
    }

    public void crear(ClienteComando comando) {
        this.servicio.crear(ClienteFactory.modelo(comando));
    }
}
