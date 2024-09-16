/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoandru;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author andru
 */
public class Usuarios {
    
    private String nombreUsuario;
    private String nick;
    private String contraseña;
    private String genero;
    private int edad;
    private boolean activo;
    private LocalDateTime fecha;
     followers fl;
    following fling;
     String[] followings;
    String[] follower;

    
    public Usuarios(){
      fl = new followers();
      fling = new following();
      followings=new String[100];
      follower=new String[100];
  }
    public Usuarios(String nombreUsuario,String nick, String contraseña, String genero,LocalDateTime fecha ,int edad ) {
        this.nombreUsuario = nombreUsuario;
        this.nick= nick;
        this.contraseña = contraseña;
        this.genero = genero;
        this.edad = edad;
        this.fecha = fecha;
        this.activo = true;
        fl = new followers();
        fling = new following();
    }
    

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getGenero() {
        return genero;
    }
    public String getNick(){
        return this.nick;
    }
    public int getEdad(){
        return this.edad;
    }
    public LocalDateTime getFechaCreacion() {
        return fecha;
    }
    public String[] getfollowings(){
        return followings;
    }
    public String[] getfollower(){
        return follower;
    }
    /*public int getEdad() {
        return edad;
    }*/
    public boolean isActivo() {
        return activo;
    }
    
    void AgregarFollower(String user){
        fl.AgregarFollower(user);
    }
    void AgregarFollowing(String user){
        fling.AgregarFollowing(user);
    }
    void DejarFollow(String user){
        fling.dejarFollow(user);
    }
    void FollowLost(String user){
        fl.followerLost(user);
    }
    
}

