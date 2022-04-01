package com.impacta.api.cliente.cliente.dtos;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class ClientDto {
    @NotBlank
    private String nameClient;
    @NotBlank
    private String DateB;

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getDateB() {
        return DateB;
    }

    public void setDateB(String dateB) {
        DateB = dateB;
    }
}
