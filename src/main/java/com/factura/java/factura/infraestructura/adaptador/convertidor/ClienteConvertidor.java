package com.factura.java.factura.infraestructura.adaptador.convertidor;

import com.factura.java.factura.infraestructura.adaptador.entity.ClienteEntity;
import org.modelmapper.ModelMapper;
import com.factura.java.factura.dominio.modelo.Cliente;
import com.factura.java.factura.dominio.repositorio.ClienteRepositorio;
import com.factura.java.factura.infraestructura.adaptador.repository.ClienteRepositoryJpa;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteConvertidor implements ClienteRepositorio {

    private final ClienteRepositoryJpa repositorioJpa;
    private ModelMapper modelMapper = new ModelMapper();

    public ClienteConvertidor(ClienteRepositoryJpa repositorioJpa) {
        this.repositorioJpa = repositorioJpa;
    }

    @Override
    public void crear(Cliente cliente) {
        ClienteEntity entity = modelMapper.map(cliente, ClienteEntity.class);
        this.repositorioJpa.save(entity);
    }
}
