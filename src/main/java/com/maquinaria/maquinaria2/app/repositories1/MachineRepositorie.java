/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maquinaria.maquinaria2.app.repositories1;

import com.maquinaria.maquinaria2.app.entities.Machine;
import com.maquinaria.maquinaria2.app.repositories.crud.MachineCRUDRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aldon
 */
@Repository
public class MachineRepositorie {
    @Autowired
    private MachineCRUDRepository machineCrudRepository;
    
    /**
     * Select
     * @return 
     */
    public List<Machine> getAll(){
        return (List<Machine>) machineCrudRepository.findAll();
    }
    
    /**
     * Insert
     * @param machine
     * @return 
     */
    public Machine save(Machine machine){
       return machineCrudRepository.save(machine);
    } 
    
    /**
     * Buscar registro
     * @param machineId
     * @return
     */
    public Optional<Machine> getMachine(int machineId){
        return machineCrudRepository.findById(machineId);
    }
    
    /**
     * Delete
     * @param machine
     */
    public void delete(Machine machine){
        machineCrudRepository.delete(machine);
    }
}
