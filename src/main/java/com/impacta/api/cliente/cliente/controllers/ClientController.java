package com.impacta.api.cliente.cliente.controllers;


import com.impacta.api.cliente.cliente.dtos.ClientDto;
import com.impacta.api.cliente.cliente.models.ClientModel;
import com.impacta.api.cliente.cliente.service.ClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@RestController
@CrossOrigin(origins = "*", maxAge =3600)
@RequestMapping("/client")
@Api(value="API REST Client")

public class ClientController {

    ClientService clientService = null;
    private List<ClientModel> ClientRepository;


    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    @ApiOperation(value="Insert clients")
    public ResponseEntity<Object> saveClient(@RequestBody @Valid ClientDto clientDto){

        var clientModel = new ClientModel();
        BeanUtils.copyProperties(clientDto, clientModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(clientService.save(clientModel));
    }

    @GetMapping
    @ApiOperation(value="Return clients all")
    public ResponseEntity<List<ClientModel>> getAllClients() {
        return ResponseEntity.status(HttpStatus.OK).body(clientService.findAll());
    }

    @GetMapping("/name/{name}")
    @ApiOperation(value="Return client by name")
    public   List<ClientModel> findByNameContains(@PathVariable("name") String name){
        return clientService.findByNameContains(name);
    }

    @GetMapping("/id/{id}")
    @ApiOperation(value="Return client by id")
    public ResponseEntity<Object> getOneClient(@PathVariable(value = "id") UUID id){
        Optional<ClientModel> clientModelOptional = clientService.findById(id);

        if (!clientModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Client not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(clientModelOptional.get());
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value="Delete client by id")
    public ResponseEntity<Object> deleteParkingSpot(@PathVariable(value = "id") UUID id){
        Optional<ClientModel> clientModelOptional = clientService.findById(id);
        if (!clientModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("client not found.");
        }
        clientService.delete(clientModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("client deleted successfully.");
    }

    @PutMapping("{id}")
    @ApiOperation(value="Update client by id")
    public ResponseEntity<Object> updateClient(@PathVariable(value = "id") UUID id,
                                                    @RequestBody @Valid ClientDto clientDto){
        Optional<ClientModel> parkingSpotModelOptional = clientService.findById(id);
        if (!parkingSpotModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Client not found.");
        }
        var clientModel = new ClientModel();
        BeanUtils.copyProperties(clientDto, clientModel);
        clientModel.setId(parkingSpotModelOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(clientService.save(clientModel));
    }















}


