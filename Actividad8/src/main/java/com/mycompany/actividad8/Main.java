/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad8;

/**
 *
 * @author Fernando
 */
public class Main {
  
    public static void main (String []) {
        
        String[] palo = {"Pika","Corazon","Diamante","Trebol"};
        String[] valor = {"A","2","3","4","5","6","7","8","9","10","J","Q","K",};
        Integer cont = 1;
        Deck deck= new Deck();
        deck.setCard(new ArrayList<Card>());
        for (int i = 0; i < palo.length; i++){
            for (int j = 0; j < valor.length; j++){
                Card card = new Card(palo[i],getColor(palo[i]),valor[j]);
                deck.getCard().add(card);
                
            }
        }
        System .out.println("El tamaño del deck es:" + deck.getCard().size());
    }
    
    
    
    public static String getColor(string palo){
        if(palo.tolowercase().equals("pika") || palo.toLowercase().equals("Trebol")){
            return "negro";
        }
        if(palo.toLowercase(Locale.ITALY).equals("corazon") || palo.toLowercase().equals("Diamante")){
            return "rojo";
        }
        
        return null;
    }
}
