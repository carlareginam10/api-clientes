package com.impacta.api.cliente.cliente.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;

import java.time.LocalDate;
import java.util.UUID;


@Entity
@Table(name = "TB_CLIENTS")
public class ClientModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 130)
    private String name;


    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthD;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthD() {
        return birthD;
    }

    public void setBirthD(LocalDate birthD) {
        this.birthD = birthD;
    }
}
