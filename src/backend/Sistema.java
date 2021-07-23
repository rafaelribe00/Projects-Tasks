/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import Front.main;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Ribeiro
 */
public class Sistema implements Serializable{
  
    private UsersList listaUsers;
    private ProjetosList listaProjetos;
    private TarefasList listaTarefas;
    private final String DataSave;
    private Users UserLogado;
    
    
    
    public Sistema(){
        this.listaUsers = new UsersList();
        this.DataSave = "Data.bin";
    }
    
    //selectors 
    public UsersList getListaUsers(){
        return listaUsers;
    }
    public String getDataSave(){
        return DataSave;
    }
    public Users getUserLogado(){
        return UserLogado;
    }
    //mutators
    public void setListaUsers(UsersList lUsers){
        this.listaUsers = lUsers;
    }
    public void setUserLogado(Users user){
        this.UserLogado = user;
    }
    
    
    public void gravaObj(String fich) {
        if (!main.gravou) {
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fich));
                oos.writeObject(this);
                oos.flush();
                oos.close();
                main.gravou = true;
                JOptionPane.showMessageDialog(null, "Dados guardados\nFicheiro: " + fich, "INFORMAÇÂO", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ATENÇÂO: Dados NÃO guardados\n\nErro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

  public Object lerObj(String fich) {
        Sistema retValue = new Sistema();
        try {
            ObjectInputStream ooin = new ObjectInputStream(new FileInputStream(fich));
            retValue = (Sistema) ooin.readObject();
            ooin.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ATENÇÂO:\n " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            if (JOptionPane.showConfirmDialog(null, "Erro na leitura dos dados \ndo ficheiro: " + fich + "\n\nDeseja continuar?", "ERRO", JOptionPane.ERROR_MESSAGE, JOptionPane.OK_CANCEL_OPTION) == 1) {
                System.exit(0);
           }
        }
        return retValue;
    }
  
  public Boolean findPassword(String pass){
        Boolean verifier = null;
        for (Users u : getListaUsers().getListaUsers()){
            if (u.getPass().equals(pass))
                verifier = true;
        }
        return verifier; 
    }
  
  public Projetos getProjetoPorTitulo(String nome){
      Projetos proj = null;
      for (Projetos p : UserLogado.getListaProjetos().getListaProjetos()){
          if (p.getTitulo().equals(nome))
              proj = p;
      }
      return proj;
  }
  
  public ProjetosList getListaProjetos(Users owner){
      ProjetosList lista = null;
      for (Users u : getListaUsers().getListaUsers()){
          if (u.equals(owner)){
              lista = owner.getListaProjetos();
          }
      }
      return lista;
  }
  
  public Boolean findEmail(String email) {
        Boolean verifier = null;  
        for (Users u : getListaUsers().getListaUsers()) {
            if (u.getEmail().equals(email))
                verifier = true;
        }
        return verifier;
    }
  
  public Users getUserPorEmail(String email) {
        for (Users u : getListaUsers().getListaUsers()) {
            if (u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }
  
    @Override
  public String toString(){
      return "Sistema --" + "listaUsers:" + listaUsers + "listaProjetos:" + listaProjetos + "listaTarefas:" + listaTarefas + "DataSave:" + DataSave;
  }
}
