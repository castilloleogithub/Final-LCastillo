/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.lcastillo.Interface;

import com.porfolio.lcastillo.Entity.Persona;
import java.util.List;

/**
 *
 * @author Castillo Leonardo
 */
public interface IPersonaService {
    public List<Persona> getPersona(); 
    
    public void savePersona(Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
}
