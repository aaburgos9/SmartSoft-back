package com.factura.java.factura.aplicacion.fabrica;

import com.factura.java.factura.aplicacion.comando.FacturaComando;
import com.factura.java.factura.dominio.modelo.Factura;
import org.springframework.stereotype.Component;

@Component
public final class FacturaFactory {

    private FacturaFactory() {
    }

    public static Factura modelo(FacturaComando comando) {
        return new Factura(
                comando.getId(),
                comando.getCliente(),
                comando.getFecha());
    }

}
