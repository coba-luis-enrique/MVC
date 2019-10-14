/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import java.sql.Connection;

/**
 *
 * @author Coba
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmEquipos frm = new frmEquipos();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        
        Mysql o = new Mysql();
        Connection c=(Connection) o.openDb();
        if(c==null)
        {
            System.out.print("cerrado");
        }
        else
        {
            System.out.print("open");
        }
        
    }
    
}
