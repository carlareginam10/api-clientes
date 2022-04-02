package com.impacta.api.cliente.cliente.service;

import com.impacta.api.cliente.cliente.models.ClientModel;
import com.impacta.api.cliente.cliente.repositories.ClientRepository;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientService {


    final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Transactional
    public ClientModel save(ClientModel clientModel) {
        return clientRepository.save(clientModel);

    }

    public List<ClientModel> findAll() {
        return clientRepository.findAll();
    }

    public Optional<ClientModel> findById(UUID id) {
        return clientRepository.findById(id);

    }
    @Transactional
    public void delete(ClientModel clientModel) {
        clientRepository.delete(clientModel);
    }
}
