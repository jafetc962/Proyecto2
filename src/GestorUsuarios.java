/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoandru;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author andru
 */
public class GestorUsuarios {

    private Usuarios[] usuarios;
    private int contador;
     private Usuarios UserLogeado;
    private String apo;
    private String fechaString;
    private Usuarios[] cuentasDesactivada;
    private String perfilUser;
    
    
    public GestorUsuarios() {
        usuarios = new Usuarios[100];
        contador = 0;
        this.cuentasDesactivada=new Usuarios[100];
        

    }

    public void AddUsuario(String user, String nick, String contra, String gen,LocalDateTime fecha ,int edad) {
        
        Usuarios nuevapersona = new Usuarios(user, nick, contra, gen, fecha ,edad);
        if (BuscarUsuario(nick)==null) {
            for (int j = 0; j < usuarios.length; j++) {
                if (usuarios[j] == null) {
                    usuarios[j] = nuevapersona;
                    System.out.println("Se registro");
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"No se registro");
    }
    
    
    void SetUsuarioLogeado(Usuarios logeado) {
        this.UserLogeado = logeado;
    }

    public Usuarios BuscarUsuario(String Apodo) {
        for (Usuarios usuario : usuarios) {
            if (usuario != null && usuario.getNick().equals(Apodo)) {
                return usuario;
            }
        }
        return null;
    }
    
     Usuarios Logged() {
        return UserLogeado;
    }
     
     Usuarios lastUserLogged(Usuarios logged){
         return logged;
     }
    
    String Busqueda(String nick){
        String busqueda = "";
        
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i]!= null && nick.contains(usuarios[i].getNick())) {
                busqueda = usuarios[i].getNick();
            }
        }
        
        return busqueda;
    }
    
    
    
     public void apodo(String a){
         this.apo=a;
         
     }
     
    
     public String mostrarApodo(){
         return apo;
     }
     
     public String FechaActual(){
          LocalDateTime fechaActual = LocalDateTime.now();
        
        // Formatear la fecha y hora en el formato deseado (por ejemplo: "dd-MM-yyyy HH:mm:ss")
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        // Convertir a String
        fechaString = fechaActual.format(formato);
        return fechaString;
     }
     
     
     
     
     public void desactivarCuenta(String userNick) {
        if (BuscarUsuario(userNick) != null) {

            for (int pos = 0; pos < cuentasDesactivada.length; pos++) {

                if (cuentasDesactivada[pos] == null) {
                if (usuarios[pos] != null && usuarios[pos].getNick().equalsIgnoreCase(userNick)) {
                    
                    cuentasDesactivada[pos] = usuarios[pos];
                    usuarios[pos]=null;

                }
              }
            }
        }
    }
     
     
     
     public Usuarios BuscarCuentaDesactivada(String Apodo) {
        for (int pos=0;pos<cuentasDesactivada.length;pos++) {
            if (cuentasDesactivada[pos] != null && cuentasDesactivada[pos].getNick().equals(Apodo)) {
               if(usuarios[pos]==null){
                   usuarios[pos]=cuentasDesactivada[pos];
                   cuentasDesactivada[pos]=null;
                   return usuarios[pos];
               }
            }
        }
        return null;
    }
     
     public void perfilUser(String userNick){
       this.perfilUser=userNick;
   }
   
   public String returnPerfil(){
       return this.perfilUser;
}
     
}
