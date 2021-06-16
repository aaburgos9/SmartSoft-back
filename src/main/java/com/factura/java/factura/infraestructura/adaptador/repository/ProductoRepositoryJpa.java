package com.factura.java.factura.infraestructura.adaptador.repository;

import com.factura.java.factura.infraestructura.adaptador.entity.ProductoEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepositoryJpa extends CrudRepository<ProductoEntity,Long> {

}
