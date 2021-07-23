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
public class Projetos implements Serializable {
    
    private Users Owner;
    private String Descricao;
    private String Titulo;
    private String Data_inicio;
    private String Data_fim;
    private final int ProjetoID;
    private UsersList ListaUsersAssociados;
    private TarefasList ListaTarefas;
    private static AtomicInteger nextId = new AtomicInteger();
    
    public Projetos(String titulo, Users owner, String descricao, String data_inicio, String data_fim){
        this.ListaUsersAssociados = new UsersList();
        this.ListaTarefas = new TarefasList(owner);
        this.ProjetoID = nextId.incrementAndGet();
        setTitulo(titulo);
        setOwner(owner);
        setDescricao(descricao);
        setData_inicio(data_inicio);
        setData_fim(data_fim);
    }
    
    //selectors
    public String getTitulo(){
        return Titulo;
    }
    public Users getOwner(){
        return Owner;
    }
    public String getDescricao(){
        return Descricao;
    }
    public String getData_inicio(){
        return Data_inicio;
    }
    public String getData_fim(){
        return Data_fim;
    }
    public int getProjetoID(){
        return ProjetoID;
    }
    public UsersList getListaUsersAssociados(){
        return ListaUsersAssociados;
    }
    public TarefasList getListaTarefas(){
        return ListaTarefas;
    }
    
    //mutators
    /* FALTA TRATAMENTO DE EXCEÇOES COMO NO USERS */
    public final void setTitulo(String titulo){
        this.Titulo = titulo;
    }
    public final void setOwner(Users owner){
        this.Owner = owner;
    }
    public final void setDescricao(String descricao){
        this.Descricao = descricao;
    }
    public final void setData_inicio(String data_inicio){
        this.Data_inicio = data_inicio;
    }
    public final void setData_fim(String data_fim){
        this.Data_fim = data_fim;
    }
    public void setListaUsersAssociados(UsersList lUsersAssociados){
        this.ListaUsersAssociados = lUsersAssociados;
    }
    public void setListaTarefas(TarefasList lTarefas){
        this.ListaTarefas = lTarefas;
    }
    
   
    @Override
    public String toString(){
        return "Projeto --" +  "ProjetoID:" + ProjetoID + " ; Titulo:" + Titulo + " ; Owner:" + Owner + " ; Descricao:" + Descricao + " ; Data de inicio:" + Data_inicio + " ; Data de fim:" + Data_fim + " ; nextId:" + nextId + " ; ListaUsersAssociados:" + ListaUsersAssociados + " ; ListaTarefas:" + ListaTarefas;
    }
}
