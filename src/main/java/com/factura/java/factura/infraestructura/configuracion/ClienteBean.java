package com.factura.java.factura.infraestructura.configuracion;

import com.factura.java.factura.dominio.repositorio.ClienteRepositorio;
import com.factura.java.factura.dominio.servicio.cliente.ServicioCrearCliente;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class ClienteBean {

    @Bean
    public ServicioCrearCliente servicioCrearClienteBean(ClienteRepositorio repositorio) {
        return new ServicioCrearCliente(repositorio);
    }
}
