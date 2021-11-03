/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maquinaria.maquinaria2.app.repositories.crud;

import com.maquinaria.maquinaria2.app.entities.Reservation;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author aldon
 */
public interface ReservationCRUDRepository extends JpaRepository<Reservation,Integer>{
    public List<Reservation> findAllByStartDateAfterAndStartDateBefore(Calendar dateOne, Calendar DateTwo);
    
    public List<Reservation> findAllByStatus(String status);
    
//     select clientId, count(*) as "total" from reservacion group by cliendId order by total desc;
    @Query ("SELECT c.client, COUNT(c.client) from Reservation AS c group by c.client order by COUNT(c.client)DESC")
    public List<Object[]> countTotalReservationsByClient();
}
