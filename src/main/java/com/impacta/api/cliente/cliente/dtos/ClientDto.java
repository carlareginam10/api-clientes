package com.impacta.api.cliente.cliente.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;


public class ClientDto {
    @NotBlank
    private String name;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthD;

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
