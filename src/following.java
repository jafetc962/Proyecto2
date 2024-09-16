/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoandru;

/**
 *
 * @author HP
 */
public class following {
    
    String[] following;
    private int conteo;
    
    public following(){
        conteo=0;
        following=new String[100];
    }
    
    private boolean buscarUsername(String username) {
        for (int contador = 0; contador < following.length; contador++) {
            if (following[contador] != null && following[contador].equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean buscar(String username){
        if(buscarUsername(username)==true){
        return true;
        }
        return false;
    }
    
    boolean AgregarFollowing(String user) {

        if (!buscarUsername(user)) {
            following[conteo] = user;
            conteo++;
            return true;
        }

        return false;
    }
        
    String listarFollowings() {
        String seguidores = " ";
        for (int contador = 0; contador < following.length; contador++) {
            if (following[contador] != null )
                seguidores += following[contador];
        }

        return seguidores;
    } 
    
    
    public void dejarFollow(String userNick){
        for(int pos=0;pos<following.length;pos++){
            if(following[pos]!=null && following[pos].equals(userNick)){
              following[pos]="";
              conteo=conteo-1;
        }
      }
    }
    
    
    public int getfollowing(){
        return this.conteo;
    }
    
    
    
    
    
}
