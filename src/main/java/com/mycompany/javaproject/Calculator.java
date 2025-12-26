package com.mycompany.javaproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author mac
 */
public interface Calculator <T extends Number> {
    double calculateFees(T clubID); 
    
}
