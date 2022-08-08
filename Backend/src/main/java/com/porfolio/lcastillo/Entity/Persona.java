/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.lcastillo.Entity;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Castillo Leonardo
 */
@Entity
@Getter @Setter
public class Persona {

    @Id
    @GenerateValue(stratagy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 1, max =50, message = "no cumple con la longitud")
    private String nombre;    
    @NotNull
    @Size(min = 1, max =50, message = "no cumple con la longitud")
    private String apellido;
   
    @Size(min = 1, max =50, message = "no cumple con la longitud")
    private String img;
    
}

