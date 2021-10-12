/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maquinaria.maquinaria2.app.services;

import com.maquinaria.maquinaria2.app.entities.Machine;
import com.maquinaria.maquinaria2.app.repositories.MachineRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author aldon
 */
@Service
public class MachineService {
    @Autowired
    private MachineRepository repository;
    
    /**
     * GET Consultar todos los registros.
     * @return 
     */
    public List<Machine> getMachines(){
        return repository.findAll();
    }
    
    /**
     * POST Crear o Registrar
     * @param machine
     * @return 
     */
    public Machine saveMachine(Machine machine){
        return repository.save(machine);
    }
    
    public Machine updateMachine(Machine machine){
        Machine existingMachine = repository.findById(machine.getId()).orElse(null);
        existingMachine.setName(machine.getName());
        existingMachine.setBrand(machine.getBrand());
        existingMachine.setModel(machine.getModel());
        existingMachine.setCategory_id(machine.getCategory_id());
        return repository.save(existingMachine);
    }
    
    public String deleteMachine (int id){
        repository.deleteById(id);
        return "Maquina eliminada" + id;
    }
}
