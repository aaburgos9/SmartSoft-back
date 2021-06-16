package com.factura.java.factura.infraestructura.configuracion;

import com.factura.java.factura.dominio.repositorio.FacturaRepositorio;
import com.factura.java.factura.dominio.servicio.factura.ServicioCrearFactura;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FacturaBean {

    @Bean
    public ServicioCrearFactura servicioCrearFacturaBean(FacturaRepositorio repositorio) {
        return new ServicioCrearFactura(repositorio);
    }
}
