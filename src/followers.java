/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoandru;

/**
 *
 * @author HP
 */
public class followers {

    //variables
    String[] follow;
    private int conteo;
    private String username;

    //constructor
    public followers() {
        conteo = 0;
        follow = new String[100];
    }

    //
    private boolean buscarUsername(String username) {
        for (int contador = 0; contador < follow.length; contador++) {
            if (follow[contador] != null && follow[contador].equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

    boolean AgregarFollower(String user) {

        if (!buscarUsername(user)) {
            follow[conteo] = user;
            conteo++;
            return true;
        }

        return false;
    }

    String listarFollowers() {
        String seguidores = " ";
        for (int contador = 0; contador < follow.length; contador++) {
            if (follow[contador] != null )
                seguidores += follow[contador];
        }

        return seguidores;
    }
    public void followerLost(String userNick){
        for(int pos=0;pos<follow.length;pos++){
            if(follow[pos]!=null && follow[pos].equals(userNick)){
              follow[pos]="";
              conteo=conteo-1;
        }
      }
    }
     
    public int getfollowers(){
        return this.conteo;
  }

}
