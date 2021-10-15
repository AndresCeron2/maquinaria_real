/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maquinaria.maquinaria2.app.repositories1;

import com.maquinaria.maquinaria2.app.entities.Reservation;
import com.maquinaria.maquinaria2.app.repositories.crud.ReservationCRUDRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aldon
 */
@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCRUDRepository reservationCrudRepository;
    
    /**
     * Select
     * @return 
     */
    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCrudRepository.findAll();
    }
    
    /**
     * Insert
     * @param reservation
     * @return 
     */
    public Reservation save(Reservation reservation){
       return reservationCrudRepository.save(reservation);
    } 
    
    /**
     * Buscar registro
     * @param reservationId
     * @return
     */
    public Optional<Reservation> getReservation(int reservationId){
        return reservationCrudRepository.findById(reservationId);
    }
    
    /**
     * Delete
     * @param reservation
     */
    public void delete(Reservation reservation){
        reservationCrudRepository.delete(reservation);
    }
}