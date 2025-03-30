/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    //estou passando parametro para definir a veloocidade minima e velocidade Maxima
        Carro carro= new Carro(0,170);
        
        System.out.println("Seja bem vindo!");
        while(true){
            System.out.println("\nMenu");
            System.out.println("1-Acelerar");
            System.out.println("2-freiar");
            System.out.println("3-velocidade atual");
            System.out.println("4-encerrar o programa");
            System.out.print("Escolha a funcao que voce deseja realizar: ");
            String escolha = sc.nextLine();
       
            switch(escolha){
                
                //aceleraçao
                case "1" :
                    try{
                        System.out.print("Digite quanto voce deseja acelerar: ");
                        double valor = sc.nextDouble();
                        
                        if(valor <= 0 || valor > carro.getVelocidadeMaxima()) {
                            throw new IllegalArgumentException("O valor de aceleracao"
                                    + " deve ser positivo e menor do que a velocidade "
                                    + "Maxima (170km)");
                        }
                        
                        carro.acelerar(valor);
                    }catch(InputMismatchException e){
                        System.out.println("Tente digitar numeros");
                    }
                    catch(IllegalArgumentException e){
                        System.out.println("Erro: " + e.getMessage());
                    }
                    finally{
                        sc.nextLine();
                        break;
                    }
                 
                    
                //frenagem
                case "2" :
                    try{
                        System.out.print("Digite quanto voce deseja frear: ");
                        double valor = sc.nextDouble();
                        
                        if(valor <= 0 || valor > carro.getVelocidade()) {
                            throw new IllegalArgumentException("O valor de frenagem"
                          + " deve ser positivo e menor igual ao da velocidades");
                        }
                        
                        carro.frear(valor);
                        
                    }
                    catch(InputMismatchException e){
                        System.out.println("Tente digitar numeros");
                    }
                    catch(IllegalArgumentException e){
                        System.out.println("Erro: " + e.getMessage());
                    }
                    finally{
                        sc.nextLine();
                        break;
                    }
                 
                    
                //velocidade
                 case "3":
                    System.out.println("Velocidade atual: " + 
                            carro.getVelocidade() + " Km/h");
                    break;
                
                    
                //encerra
                case "4":
                    return;
                    
                    
                default:
                    System.out.println("Opcao invalida! Digite um numero entre 1 e 4.");
                    
            }
            
        }
    }
}
