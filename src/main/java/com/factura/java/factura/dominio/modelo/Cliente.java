package com.factura.java.factura.dominio.modelo;

import com.factura.java.factura.dominio.util.Validacion;

import java.time.LocalDate;

public class Cliente {
    private long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private LocalDate fecha_nacimiento;
    private String telefono;
    private String email;

    public Cliente(long id, String nombre, String apellido, String direccion, LocalDate fecha_nacimiento, String telefono, String email) {
        Validacion.validarNoVacio(nombre,"El campo nombre no puede estar vacio");
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.email = email;
    }

    public Cliente() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
