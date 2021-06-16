package com.factura.java.factura.infraestructura.adaptador.controller.detalle;

import com.factura.java.factura.aplicacion.comando.DetalleComando;
import com.factura.java.factura.aplicacion.manejador.detalle.ManejadorCrearDetalle;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("detalle")
public class DetalleController {

    private ManejadorCrearDetalle manejador;

    public DetalleController(ManejadorCrearDetalle manejador){
        this.manejador = manejador;
    }

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody DetalleComando comando) {
        manejador.crear(comando);
    }
}
