/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW1OOP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class Panel extends JPanel implements ActionListener {

    JButton saveButton = new JButton("Save");
    JButton exitButton = new JButton("Exit");

    public Panel(FileManager fm) {

        this.saveButton.addActionListener((ev) -> fm.saveFile());

        this.exitButton.addActionListener((ev) -> fm.exitFile());

        add(saveButton);
        add(exitButton);
    }

    Panel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source == this.saveButton) {
          this.saveButton.setText(this.saveButton.getText());
        } else if (source == this.exitButton) {
          this.exitButton.setText(this.exitButton.getText()); 
        }       
    }


   

}
