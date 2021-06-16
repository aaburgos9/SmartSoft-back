package com.factura.java.factura.infraestructura.adaptador.convertidor;

import com.factura.java.factura.dominio.modelo.Producto;
import com.factura.java.factura.dominio.repositorio.ProductoRepositorio;
import com.factura.java.factura.infraestructura.adaptador.entity.ProductoEntity;
import com.factura.java.factura.infraestructura.adaptador.repository.ProductoRepositoryJpa;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductoConvertidor implements ProductoRepositorio {

    private final ProductoRepositoryJpa repositorioJpa;
    private ModelMapper modelMapper = new ModelMapper();

    public ProductoConvertidor(ProductoRepositoryJpa repositorioJpa) {
        this.repositorioJpa = repositorioJpa;
    }

    @Override
    public void crear(Producto producto) {
        ProductoEntity entity = modelMapper.map(producto, ProductoEntity.class);
        this.repositorioJpa.save(entity);
    }




}
