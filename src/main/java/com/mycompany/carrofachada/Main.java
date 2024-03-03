/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrofachada;

/**
 *
 * @author fleme
 */
public class Main {
    
    public static void main(String[] args) {
        
        Cinto cinto = new Cinto();
        Farol farol = new Farol();
        Motor motor = new Motor();
        Porta porta = new Porta();
        Radio radio = new Radio();
        
        Carrofachada carro = new Carrofachada(cinto, farol, motor, porta, radio);
        
        carro.ligarCarro();
        carro.desligarCarro();
    }
}
