package com.factura.java.factura.infraestructura.adaptador.convertidor;

import com.factura.java.factura.dominio.modelo.Factura;
import com.factura.java.factura.dominio.repositorio.FacturaRepositorio;
import com.factura.java.factura.infraestructura.adaptador.entity.FacturaEntity;
import com.factura.java.factura.infraestructura.adaptador.repository.FacturaRepositoryJpa;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

@Repository
public class FacturaConvertidor implements FacturaRepositorio {

    private final FacturaRepositoryJpa repositorioJpa;
    private ModelMapper modelMapper = new ModelMapper();

    public FacturaConvertidor(FacturaRepositoryJpa repositorioJpa) {
        this.repositorioJpa = repositorioJpa;
    }


    @Override
    public Factura crear(Factura factura) {
        FacturaEntity entity = modelMapper.map(factura, FacturaEntity.class);
        Factura respon = modelMapper.map(this.repositorioJpa.save(entity), Factura.class);
        return respon ;
    }
}
