/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maquinaria.maquinaria2.app.repositories1;

import com.maquinaria.maquinaria2.app.repositories.crud.ClientCRUDRepository;
import java.util.List;
import com.maquinaria.maquinaria2.app.entities.Client;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aldon
 */
@Repository
public class ClientRepositorie {
    @Autowired
    private ClientCRUDRepository clientCrudRepository;
    
    /**
     * Select
     * @return 
     */
    public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }
    
    /**
     * Insert
     * @param client
     * @return 
     */
    public Client save(Client client){
       return clientCrudRepository.save(client);
    } 
    
    /**
     * Buscar registro
     * @param clientId
     * @return
     */
    public Optional<Client> getClient(int clientId){
        return clientCrudRepository.findById(clientId);
    }
    
    /**
     * Delete
     * @param client
     */
    public void delete(Client client){
        clientCrudRepository.delete(client);
    }
}

