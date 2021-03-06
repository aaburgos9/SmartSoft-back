package com.factura.java.factura.infraestructura.exception;

import java.util.Date;

public class ExceptionResponse {
    private Date timeStamp;
    private String mensaje;
    private String descripcion;

    public ExceptionResponse(Date timeStamp, String mensaje, String detalle) {
        super();
        this.timeStamp = timeStamp;
        this.mensaje = mensaje;
        this.descripcion = detalle;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public String getdDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String detalle) {
        this.descripcion = detalle;
    }

}
