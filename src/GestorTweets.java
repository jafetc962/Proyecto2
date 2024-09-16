/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoandru;

import javax.swing.JOptionPane;

/**
 *
 * @author andru
 */
public class GestorTweets {
    
 private tweets[] tweets;
    private int contador;
    

    public GestorTweets() {
        tweets = new tweets[100]; 
        contador = 0;
    }
    
     public void agregarTweet(String user, String tt, String date) {
      tweets nuevoTweet= new tweets(user, tt, date);
      
          for (int j = 0; j < tweets.length; j++) {
              if (tweets[j] == null) {
                    tweets[j] = nuevoTweet;
                    System.out.println("Se registro");
                    return;
                }
          
      }
      JOptionPane.showMessageDialog(null,"No se registro");
    }
     
     
     public tweets BuscarTweet(String Apodo) {
        for (tweets tweet : tweets) {
            if (tweet != null) {
                return tweet;
            }
        }
        return null;
    }
    
public tweets[] obtenerTweets() {
    return this.tweets; // Devuelve el arreglo de tweets
}

    
    
    
    
        
}
