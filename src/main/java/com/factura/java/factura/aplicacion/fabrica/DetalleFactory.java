package com.factura.java.factura.aplicacion.fabrica;

import com.factura.java.factura.aplicacion.comando.DetalleComando;
import com.factura.java.factura.dominio.modelo.Detalle;
import org.springframework.stereotype.Component;

@Component
public final class DetalleFactory {

    private DetalleFactory() {
    }

    public static Detalle modelo(DetalleComando comando) {
        return new Detalle(
                comando.getId(),
                comando.getFactura(),
                comando.getProducto(),
                comando.getCantidad(),
                comando.getPrecio());
    }
}
