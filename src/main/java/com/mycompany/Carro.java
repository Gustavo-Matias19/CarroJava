/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;


public class Carro {
    private double velocidade,velocidadeMaxima;

    public Carro() {
    }

    public Carro(double velocidade, double velocidadeMaxima) {
        this.velocidade = velocidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    
    
    public double acelerar(double valor){
        return velocidade += valor;
    }
    public double frear(double valor){
        return velocidade -= valor;
    }
    
}

