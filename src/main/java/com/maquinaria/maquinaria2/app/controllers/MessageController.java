/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maquinaria.maquinaria2.app.controllers;

import com.maquinaria.maquinaria2.app.entities.Message;
import com.maquinaria.maquinaria2.app.services.MessageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author aldon
 */
@RestController
@RequestMapping("Message")
public class MessageController {
    @Autowired
    private MessageService service;
    
    @GetMapping("/all")
    public List<Message> findAllClient(){
        return service.getAll();
    }
    
    @PostMapping("/save")
    public ResponseEntity addMachine(@RequestBody Message message){
        service.save(message);
        return ResponseEntity.status(201).build();
    }
    
    @PutMapping("/update")
    public ResponseEntity updateMachine(@RequestBody Message message){
        service.update(message);
        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/delete")
    public ResponseEntity deleteMachine(@RequestBody Message message){
        service.deleteMessage(message.getIdMessage());
        return ResponseEntity.status(204).build();
    }
}
