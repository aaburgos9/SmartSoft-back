package com.factura.java.factura.infraestructura.adaptador.convertidor;

import com.factura.java.factura.dominio.modelo.Detalle;
import com.factura.java.factura.dominio.repositorio.DetalleRepositorio;
import com.factura.java.factura.infraestructura.adaptador.entity.DetalleEntity;
import com.factura.java.factura.infraestructura.adaptador.repository.DetalleRepositoryJpa;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

@Repository
public class DetalleConvertidor implements DetalleRepositorio {

    private final DetalleRepositoryJpa repositorioJpa;
    private ModelMapper modelMapper = new ModelMapper();

    public DetalleConvertidor(DetalleRepositoryJpa repositorioJpa) {
        this.repositorioJpa = repositorioJpa;
    }

    @Override
    public void crear(Detalle detalle) {
        DetalleEntity entity = modelMapper.map(detalle, DetalleEntity.class);
        this.repositorioJpa.save(entity);
    }
}
