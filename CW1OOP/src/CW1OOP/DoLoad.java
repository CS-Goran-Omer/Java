/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW1OOP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author user
 */
public class DoLoad implements ActionListener {
    
    private MyGUI app;
    

    public DoLoad(MyGui app) {
        this.app = app;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        this.app.doLoad();
    }
    
}
