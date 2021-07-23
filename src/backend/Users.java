/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Rafael Ribeiro
 */
public class Users implements Serializable {
    
    private String Pass;
    private String Nome;
    private String Email;
    private String Genero;
    private final int UsersID;
    private ProjetosList ListaProjetos;
    private static AtomicInteger nextId = new AtomicInteger();
    
    public Users(String nome, String email, String pass, String genero, Users owner) {
        this.UsersID = nextId.incrementAndGet();
        this.ListaProjetos = new ProjetosList();
        this.Nome = nome;
        this.Email = email;
        this.Pass = pass;
        setGenero(genero);
    }
    
    //selectors
    public String getNome(){
        return Nome;
    }
    public String getEmail(){
        return Email;
    }
    public String getPass(){
        return Pass;
    }
    public String getGenero(){
        return Genero;
    }
    public int getUsersID(){
        return UsersID;
    }
    public ProjetosList getListaProjetos(){
        return ListaProjetos;
    }
    
    //mutators 
    public final void setNome(String nome){
        this.Nome = nome;
    }
    
    public final void setEmail(String email){
        this.Email = email;
    }
    
    public final void setPass(String pass){
        this.Pass = pass;
    }
    
    public final void setGenero(String genero){
        this.Genero = genero;
    }
    public void setListaProjetos(ProjetosList lista){
        this.ListaProjetos = lista;
    }
     
     
    @Override
    public String toString(){
        return "Users --" + "UsersID:" + UsersID + " ; Nome:" + Nome + " ; Email:" + Email + " ; Pass:" + Pass + " ; Genero:" + Genero + " ; ListaProjetos:" + ListaProjetos;
    }
}
