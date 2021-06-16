package com.factura.java.factura.dominio.util;

import com.factura.java.factura.dominio.exception.ExceptionDominio;

import java.time.LocalDateTime;

public class Validacion {

    private Validacion() {
    }

    public static void menorIgualCero(int precio, String mensaje){
        if(precio <= 0 ) {
            throw new ExceptionDominio(mensaje);
        }
    }
    public static void validarFechaAnterior(LocalDateTime fecha, String mensaje){
        if(fecha.isBefore(LocalDateTime.now())){
            throw new ExceptionDominio(mensaje);
        }
    }
    public static void validarNoVacio(Object valor, String mensaje) {
        if(valor == null) {
            throw new ExceptionDominio(mensaje);
        }
    }
}
