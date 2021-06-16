package com.factura.java.factura.dominio.exception;

public class ExceptionDominio extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExceptionDominio(String mensaje){
        super(mensaje);
    }
}
