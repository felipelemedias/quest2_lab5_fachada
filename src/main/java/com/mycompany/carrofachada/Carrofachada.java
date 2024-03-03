/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.carrofachada;

/**
 *
 * @author fleme
 */
public class Carrofachada {

    Cinto cinto;
    Farol farol;
    Motor motor;
    Porta porta;
    Radio radio;

    public Carrofachada(Cinto cinto, Farol farol, Motor motor, Porta porta, Radio radio) {
        this.cinto = cinto;
        this.farol = farol;
        this.motor = motor;
        this.porta = porta;
        this.radio = radio;
    }
    
    public void ligarCarro(){
        System.out.println("Preparando para usar o carro..");
        
        porta.abrir();
        porta.fechar();
        cinto.colocarCinto();
        motor.liga();
        farol.ligar();
        radio.ligar();
        radio.ajustarVolume(10);
    }
    
    public void desligarCarro(){
        System.out.println("Preparando para sair do carro..");
        
        radio.ajustarVolume(0);
        radio.desligar();
        motor.desliga();
        farol.desligar();
        cinto.retirarCinto();
        porta.abrir();
        porta.fechar();
    }
    
}
