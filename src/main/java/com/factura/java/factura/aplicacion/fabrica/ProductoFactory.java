package com.factura.java.factura.aplicacion.fabrica;

import com.factura.java.factura.aplicacion.comando.ProductoComando;
import com.factura.java.factura.dominio.modelo.Producto;
import org.springframework.stereotype.Component;

@Component
public final class ProductoFactory {

    private ProductoFactory() {
    }

    public static Producto modelo(ProductoComando comando) {
        return new Producto(
                comando.getId(),
                comando.getNombre(),
                comando.getPrecio(),
                comando.getStock());
    }
}
