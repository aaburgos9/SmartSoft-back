package com.factura.java.factura.aplicacion.manejador.factura;

import com.factura.java.factura.aplicacion.comando.FacturaComando;
import com.factura.java.factura.aplicacion.fabrica.FacturaFactory;
import com.factura.java.factura.dominio.modelo.Factura;
import com.factura.java.factura.dominio.servicio.factura.ServicioCrearFactura;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearFactura {

    private final ServicioCrearFactura servicio;

    public ManejadorCrearFactura(ServicioCrearFactura servicio) {
        this.servicio = servicio;
    }

    public Factura crear(FacturaComando comando) {
        return this.servicio.crear(FacturaFactory.modelo(comando));
    }
}
