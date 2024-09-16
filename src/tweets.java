/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoandru;

import java.util.Date;

public class tweets {
    private String tweet;
    private String user;
    private String fecha;

    public tweets(String user, String tweet, String date) {
        this.user = user;
        this.tweet = tweet;
        this.fecha = date; // Inicializa la fecha al momento de crear el tweet
    }

    public String getUser() {
        return user;
    }

    public String getTweet() {
        return tweet;
    }

    public String getFecha() {
        return fecha;
    }
}

