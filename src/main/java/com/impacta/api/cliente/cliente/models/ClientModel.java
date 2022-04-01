package com.impacta.api.cliente.cliente.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "TB_CLIENTS")
public class ClientModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 130)
    private String nameClient;

    @Column(nullable = false)
    private LocalDateTime birthDate;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public LocalDateTime getRegistrationDate() {
        return birthDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.birthDate = registrationDate;
    }
}
