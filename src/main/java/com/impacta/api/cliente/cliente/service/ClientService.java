package com.impacta.api.cliente.cliente.service;

import com.impacta.api.cliente.cliente.models.ClientModel;
import com.impacta.api.cliente.cliente.repositories.ClientRepository;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
}
