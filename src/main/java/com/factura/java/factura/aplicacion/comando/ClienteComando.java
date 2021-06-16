package com.factura.java.factura.aplicacion.comando;

import java.time.LocalDate;

public class ClienteComando {
    private long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private LocalDate fecha_nacimiento;
    private String telefono;
    private String email;

    public ClienteComando() {
    }

    public ClienteComando(long id, String nombre, String apellido, String direccion, LocalDate fecha_nacimiento, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
}
