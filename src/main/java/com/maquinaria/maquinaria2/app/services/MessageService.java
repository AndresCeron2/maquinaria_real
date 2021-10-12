/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maquinaria.maquinaria2.app.services;

import com.maquinaria.maquinaria2.app.entities.Message;
import com.maquinaria.maquinaria2.app.repositories.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author aldon
 */
@Service
public class MessageService {
    @Autowired
    private MessageRepository repository;
    
    /**
     * GET Consultar todos los registros.
     * @return 
     */
    public List<Message> getMessage(){
        return repository.findAll();
    }
    
    /**
     * POST Crear o Registrar
     * @param message
     * @return 
     */
    public Message saveMessage(Message message){
        return repository.save(message);
    }
    
    public Message updateMessage(Message message){
        Message existingMessage = repository.findById(message.getId()).orElse(null);
        existingMessage.setMessagetext(message.getMessagetext());
        return repository.save(existingMessage);
    }
    
    public String deleteMessage (int id){
        repository.deleteById(id);
        return "Mensaje eliminado" + id;
    }
}
