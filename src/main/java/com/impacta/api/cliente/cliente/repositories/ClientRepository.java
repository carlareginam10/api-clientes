package com.impacta.api.cliente.cliente.repositories;

import com.impacta.api.cliente.cliente.models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository <ClientModel, UUID> {


}
