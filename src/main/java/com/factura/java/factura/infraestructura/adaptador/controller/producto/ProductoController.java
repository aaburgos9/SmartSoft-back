package com.factura.java.factura.infraestructura.adaptador.controller.producto;

import com.factura.java.factura.aplicacion.comando.ProductoComando;
import com.factura.java.factura.aplicacion.manejador.producto.ManejadorCrearProducto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("producto")
public class ProductoController {

    private ManejadorCrearProducto manejador;

    public ProductoController(ManejadorCrearProducto manejador){
        this.manejador = manejador;
    }

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ProductoComando comando) {
        manejador.crear(comando);
    }
}

