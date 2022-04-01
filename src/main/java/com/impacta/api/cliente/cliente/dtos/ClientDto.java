package com.impacta.api.cliente.cliente.dtos;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class ClientDto {
    @NotBlank
    private String nameClient;
    @NotBlank
    private LocalDateTime birthDate;

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }
}
