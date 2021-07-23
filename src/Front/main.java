/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import Front.Login;
import backend.Sistema;

/**
 *
 * @author Rafael Ribeiro
 */
public class main {
    
    public static boolean gravou;
    
    public static void main (String[] args){
        
        gravou=true;
        Sistema sistema = new Sistema();
        sistema = (Sistema) sistema.lerObj(sistema.getDataSave());
        
        Login login = new Login(sistema);
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
}
