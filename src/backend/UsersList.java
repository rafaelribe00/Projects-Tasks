/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rafael Ribeiro
 */
public class UsersList implements Serializable {
    
    private ArrayList<Users> listaUsers;
    
    public UsersList() {
        this.listaUsers = new ArrayList<>();
    }
    
    public ArrayList<Users> getListaUsers(){
        return listaUsers;
    }
    
    public void setListaUsers(ArrayList<Users> lUsers){
        this.listaUsers = lUsers;
    }
    
    public void adicionarUsers(Users u) {
        listaUsers.add(u);
    }
    
    public Users getUser(String email){
        Users user = null;
        for (Users u : listaUsers){
            if (u.getEmail().equals(email))
                user = u;
        }
        return user;
    }
    
    public boolean findPassword(String pass){
        Boolean verifier = null;
        for (Users u : listaUsers){
            if (u.getPass().equals(pass))
                verifier = true;
        }
        return verifier; 
    }
    
    @Override
    public String toString(){
        return "UsersList -- " + listaUsers;
    }
}
