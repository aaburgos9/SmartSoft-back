package com.factura.java.factura.aplicacion.manejador.detalle;

import com.factura.java.factura.aplicacion.comando.DetalleComando;
import com.factura.java.factura.aplicacion.fabrica.DetalleFactory;
import com.factura.java.factura.dominio.servicio.detalle.ServicioCrearDetalle;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearDetalle {

    private final ServicioCrearDetalle servicio;

    public ManejadorCrearDetalle(ServicioCrearDetalle servicio) {
        this.servicio = servicio;
    }

    public void crear(DetalleComando comando) {
        this.servicio.crear(DetalleFactory.modelo(comando));
    }
}
