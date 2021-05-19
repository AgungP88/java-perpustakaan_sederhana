/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.controller;

import perpus.model.modelLogin;
import perpus.view.ViewLogin;

/**
 *
 * @author hp
 */
public class controllerLogin {
    private modelLogin mL;
    private ViewLogin vL;
    
    public controllerLogin(ViewLogin vL){
        this.vL = vL;
    }
    
    public void loginUser(){
        mL = new modelLogin();
        mL.setUsername(vL.getUsernameTxt().getText());
        mL.setPassword(vL.getPasswordTxt().getText());
        
        mL.login();
    }
}
