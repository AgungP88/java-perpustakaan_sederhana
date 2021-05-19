/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mvc;


import java_mvc.dashboard;
import perpus.view.ViewLogin;
/**
 *
 * @author hp
 */
public class Run_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        dashboard utama = new dashboard();
//        utama.setVisible(true);

        ViewLogin login = new ViewLogin();
        login.setVisible(true);
    }
    
}
