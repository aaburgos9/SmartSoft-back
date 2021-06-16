package com.factura.java.factura.aplicacion.manejador.producto;

import com.factura.java.factura.aplicacion.comando.ProductoComando;
import com.factura.java.factura.aplicacion.fabrica.ProductoFactory;
import com.factura.java.factura.dominio.servicio.producto.ServicioCrearProducto;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearProducto {


    private final ServicioCrearProducto servicio;

    public ManejadorCrearProducto(ServicioCrearProducto servicio) {
        this.servicio = servicio;
    }
    public void crear(ProductoComando comando) {
        this.servicio.crear(ProductoFactory.modelo(comando));
    }



}
