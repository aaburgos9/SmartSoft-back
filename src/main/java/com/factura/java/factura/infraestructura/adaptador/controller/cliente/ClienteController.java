package com.factura.java.factura.infraestructura.adaptador.controller.cliente;

import com.factura.java.factura.aplicacion.comando.ClienteComando;
import com.factura.java.factura.aplicacion.manejador.cliente.ManejadorCrearCliente;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("cliente")
public class ClienteController {

    private ManejadorCrearCliente manejador;

    public ClienteController(ManejadorCrearCliente manejador){
        this.manejador = manejador;
    }

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ClienteComando comando) {
        manejador.crear(comando);
    }
}
