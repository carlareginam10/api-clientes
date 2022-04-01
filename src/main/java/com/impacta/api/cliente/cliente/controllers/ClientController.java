package com.impacta.api.cliente.cliente.controllers;


import com.impacta.api.cliente.cliente.dtos.ClientDto;
import com.impacta.api.cliente.cliente.models.ClientModel;
import com.impacta.api.cliente.cliente.service.ClientService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@CrossOrigin(origins = "*", maxAge =3600)
@RequestMapping("/client")

public class ClientController {

    final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<Object> saveClient(@RequestBody @Valid ClientDto clientDto){

        var clientModel = new ClientModel();
        BeanUtils.copyProperties(clientDto, clientModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(clientService.save(clientModel));
    }


}


