package com.factura.java.factura.infraestructura.adaptador.repository;

import com.factura.java.factura.infraestructura.adaptador.entity.FacturaEntity;
import org.springframework.data.repository.CrudRepository;

public interface FacturaRepositoryJpa extends CrudRepository<FacturaEntity,Long> {
}
