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
public class TarefasList implements Serializable{
    
   private ArrayList<Tarefas> listaTarefas;
   
   public TarefasList(Users owner){
       this.listaTarefas = new ArrayList<>();
   }
   
   //selectors
   public ArrayList<Tarefas> getListaTarefas(){
        return listaTarefas;
    }
   
   public void setListaTarefas(ArrayList<Tarefas> lTarefas){
        this.listaTarefas = lTarefas;
    }
   
   public void adicionarTarefa(Tarefas t) {
        listaTarefas.add(t);
    }
   
   public Tarefas getTarefa(int tarefaID){
       Tarefas tarefa = null;
       for (Tarefas t : listaTarefas){
           if (t.getTarefaID() == tarefaID)
               tarefa = t;
       }
       return tarefa;
   }
   
   @Override
   public String toString(){
        return "ListaTarefas -- " + "listaTarefas:" + listaTarefas;
    }
}
