/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW1OOP;

import com.apple.eio.FileManager;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Goran
 */
public class ExamplePanel extends JPanel implements ActionListener {
    
   

    private final JButton button1 = new JButton( "Save");
    private final JButton button2 = new JButton( "Exit");
    private PopupMenu myLabel;
    
        
    public ExamplePanel(FileManager fm) {
        
    
        /*this.button1.addActionListener((ev) -> fm.saveFile());
        this.button2.addActionListener((ev) -> fm.exitFile());*/
        
        add(this.myLabel);
        add(this.button1);
        add(this.button2);
    }

    ExamplePanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
            if (source == this.button1) {
                this.button1.setText(this.button1.getText());
            } else if (source == this.button2) {
                this.button2.setText(this.button2.getText()); 
            }
    }

    



  
}
