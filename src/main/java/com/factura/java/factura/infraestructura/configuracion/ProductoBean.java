package com.factura.java.factura.infraestructura.configuracion;

import com.factura.java.factura.dominio.repositorio.ProductoRepositorio;
import com.factura.java.factura.dominio.servicio.producto.ServicioCrearProducto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class ProductoBean {

    @Bean
    public ServicioCrearProducto servicioCrearProductoBean(ProductoRepositorio repositorio) {
        return new ServicioCrearProducto(repositorio) {

        };
    }
}
