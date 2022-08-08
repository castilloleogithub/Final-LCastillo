/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.lcastillo.Controler;

import com.porfolio.lcastillo.Interface.IPersonaService;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Castillo Leonardo
 */
@RestController
public class PersonaController {
    @autowired IPersonaService ipersonaService;
    
    
}
