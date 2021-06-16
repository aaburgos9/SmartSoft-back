package com.factura.java.factura.infraestructura.adaptador.repository;

import com.factura.java.factura.infraestructura.adaptador.entity.DetalleEntity;
import org.springframework.data.repository.CrudRepository;

public interface DetalleRepositoryJpa extends CrudRepository<DetalleEntity,Long> {
}
