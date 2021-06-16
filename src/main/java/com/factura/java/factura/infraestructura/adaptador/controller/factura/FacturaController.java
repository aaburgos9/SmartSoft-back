package com.factura.java.factura.infraestructura.adaptador.controller.factura;

import com.factura.java.factura.aplicacion.comando.FacturaComando;
import com.factura.java.factura.aplicacion.manejador.factura.ManejadorCrearFactura;
import com.factura.java.factura.dominio.modelo.Factura;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("factura")
public class FacturaController {

    private ManejadorCrearFactura manejador;

    public FacturaController(ManejadorCrearFactura manejador){
        this.manejador = manejador;
    }

    @PostMapping("/crear")
    public Factura crear(@RequestBody FacturaComando comando) {
        System.out.println(manejador.crear(comando));
       return manejador.crear(comando);
    }
}
