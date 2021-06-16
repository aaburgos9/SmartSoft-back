package com.factura.java.factura.aplicacion.fabrica;

import com.factura.java.factura.aplicacion.comando.ClienteComando;
import com.factura.java.factura.dominio.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public final class ClienteFactory {

    private ClienteFactory() {
    }

    public static Cliente modelo(ClienteComando comando) {
        return new Cliente(
                comando.getId(),
                comando.getNombre(),
                comando.getApellido(),
                comando.getDireccion(),
                comando.getFecha_nacimiento(),
                comando.getTelefono(),
                comando.getEmail());
    }
}
