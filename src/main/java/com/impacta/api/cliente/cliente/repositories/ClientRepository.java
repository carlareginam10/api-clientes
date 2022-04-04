package com.impacta.api.cliente.cliente.repositories;

import ch.qos.logback.core.net.server.Client;
import com.impacta.api.cliente.cliente.models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository <ClientModel, UUID> {

 List<ClientModel> findByNameContains(String name);


}
