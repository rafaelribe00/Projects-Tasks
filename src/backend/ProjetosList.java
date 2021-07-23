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
public class ProjetosList implements Serializable{
    
    private ArrayList<Projetos> listaProjetos;
    
    public ProjetosList(){
        this.listaProjetos = new ArrayList<>();
    }
    
    //selectors
    public ArrayList<Projetos> getListaProjetos(){
        return listaProjetos;
    }
    
    public void setListaProjetos(ArrayList<Projetos> lProjetos){
        this.listaProjetos = lProjetos;
    }
    
    public void adicionarProjeto(Projetos p) {
        listaProjetos.add(p);
    }
    
    public Projetos getProjeto(int projetoID){
       Projetos projeto = null;
       for (Projetos p : listaProjetos){
           if (p.getProjetoID() == projetoID)
               projeto = p;
       }
       return projeto;
   }
   
    @Override
    public String toString(){
        return "ListaProjetos -- " + listaProjetos;
    }
}
