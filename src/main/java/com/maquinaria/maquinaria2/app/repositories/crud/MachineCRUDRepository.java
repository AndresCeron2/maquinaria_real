/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maquinaria.maquinaria2.app.repositories.crud;


import com.maquinaria.maquinaria2.app.entities.Machine;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author aldon
 */

public interface MachineCRUDRepository extends JpaRepository<Machine,Integer>{
    
}
