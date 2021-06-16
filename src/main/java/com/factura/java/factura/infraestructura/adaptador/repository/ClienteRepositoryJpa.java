package com.factura.java.factura.infraestructura.adaptador.repository;

import com.factura.java.factura.infraestructura.adaptador.entity.ClienteEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepositoryJpa extends CrudRepository<ClienteEntity,Long> {
}
