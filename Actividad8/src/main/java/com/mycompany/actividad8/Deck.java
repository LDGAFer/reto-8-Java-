/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad8;

import java.util.Objects;

/**
 *
 * @author Fernando
 */
public class Deck {
    
    private List<Card> card;
    private Integer numCard = 52;

    public List<Card> getCard() {
        this.card = card;
    }
    
    public void setCard (List<Card> card) {
        this.card = card;
    }

    public void setNumCard(Integer numCard) {
        this.numCard = numCard;
    }
    
    
    public void mezclar (){
        collections.shuffle(card);
    }
    public void barajar (Deck deck){
        //Abre metodo barajar
    }
    public void pick (Deck deck){
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt (deck.getCard().size());
        Card card = deck.getCard().get(index);
    }
    
    // Array from 0 to 51 
        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 
                   9, 10, 11, 12, 13, 14, 15, 
                   16, 17, 18, 19, 20, 21, 22, 
                   23, 24, 25, 26, 27, 28, 29, 
                   30, 31, 32, 33, 34, 35, 36, 
                   37, 38, 39, 40, 41, 42, 43, 
                   44, 45, 46, 47, 48, 49, 50,  
                   51}; {
       
        shuffle(a, 52);
        
        // Imprimir todos los elementos barajados de las cartas 
        for (int i = 0; i < 52; i ++) 
           System.out.print(a+" "); 
           
       // Array rojo y nrgro
        int a[] = {rojo y negro}
       
        shuffle(rojo, negro);
        // Imprimir todos los elementos barajados de las cartas 
        for (int i = rojo, nego; i ++) 
           System.out.print(a+" "); 
        
        // Array from pika, corazon, diamante, trebol
        int a[] = {"Pika", "corazon", "diamante", "trebol"}; 
       
        shuffle(a, pika, corazon, diamante, trebol);
        
        // Imprimir todos los elementos barajados de las cartas 
        for (int i = pika, corazon, diamante, trebol; i ++) 
           System.out.print(a+" "); 
        }
    } 
    
}