/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Rafael Ribeiro
 */
public class Tarefas implements Serializable{
    
    private String Nome;
    private String Descricao;
    private String Estado;
    private String Data_fim;
    private Users Owner;
    private ArrayList<Users> ListaUsersAssociadosTarefas;
    private final int TarefaID;
    private static AtomicInteger nextId = new AtomicInteger();

    
    public Tarefas(String nome, String descricao, String estado, String data_fim, Users criador){
        this.TarefaID = nextId.incrementAndGet();
        this.ListaUsersAssociadosTarefas = new ArrayList<>();
        setNome(nome);
        setDescricao(descricao);
        setData_fim(data_fim);
        setEstado(estado);
        setOwner(criador);
    }
    
    //selectors
    public String getNome(){
        return Nome;
    }
    public int getTarefaID(){
        return TarefaID;
    }
    public String getDescricao(){
        return Descricao;
    }
    public String getEstado(){
        return Estado;
    }
    public String getData_fim(){
        return Data_fim;
    }
    public Users getOwner(){
        return Owner;
    }
    public ArrayList<Users> getListaUserAssociadoTarefas(){
        return ListaUsersAssociadosTarefas;
    }
    
    //mutators
    public final void setNome(String nome){
        this.Nome = nome;
    }
    public final void setDescricao(String descricao){
        this.Descricao = descricao;
    }
    public final void setEstado(String estado){
        this.Estado = estado;
    }
    public final void setData_fim(String data_fim){
        this.Data_fim = data_fim;
    }
    public final void setOwner(Users criador){
        this.Owner = criador;
    }
    public final void setListaUsersAssociados(ArrayList<Users> lista){
        this.ListaUsersAssociadosTarefas = lista;
    }
    public void adicionarMembrosAssociadosTarefa(Users assoc){
        ListaUsersAssociadosTarefas.add(assoc);
    }
    
    @Override
    public String toString(){
        return "Tarefas --" + "TarefaID:" + TarefaID + " ; Nome:" + Nome + " ; Descricao:" + Descricao + " ; Estado:" + Estado +  " ; Data_fim:" + Data_fim + " ; Owner:" + Owner + " ; ListaUsersAsssociadosTarefas:" + ListaUsersAssociadosTarefas + " ; nextId:" + nextId;
    }
    
}
