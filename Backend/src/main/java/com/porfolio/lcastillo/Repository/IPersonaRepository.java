/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.lcastillo.Repository;

import com.porfolio.lcastillo.Entity.Persona;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Castillo Leonardo
 */
@Repository
public class IPersonaRepository extends JpaRepository<Persona, Long> {
    
    
    
}
