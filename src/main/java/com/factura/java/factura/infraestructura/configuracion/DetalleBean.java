package com.factura.java.factura.infraestructura.configuracion;

import com.factura.java.factura.dominio.repositorio.DetalleRepositorio;
import com.factura.java.factura.dominio.servicio.detalle.ServicioCrearDetalle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DetalleBean {

    @Bean
    public ServicioCrearDetalle servicioCrearDetalleBean(DetalleRepositorio repositorio) {
        return new ServicioCrearDetalle(repositorio);
    }
}
