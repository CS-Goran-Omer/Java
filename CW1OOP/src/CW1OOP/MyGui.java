/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW1OOP;

import java.awt.Dimension;
import java.awt.PageAttributes;
import static java.awt.PageAttributes.MediaType.C1;
import static java.awt.PageAttributes.MediaType.C2;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author user
 */
public class MyGui extends JFrame {

    /*private JButton loadButton = new JButton("Load");
    private JButton saveButton = new JButton("Save");
    private JButton exitButton = new JButton("Exit");*/
    public MyGui() throws IOException {

        Panel myPanel = new Panel();
        add(myPanel);
        BufferedImage image = ImageIO.read(MyGui.class.getClassLoader().getResourceAsStream("Image.jpg"));  
        pack();
        setVisible(true);

    }

    public static void launch() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("This is Image");
        JButton saveButton = new JButton("Save");
        JButton exitButton = new JButton("Exit");
        JPanel panel1 = new JPanel();
        frame.setSize(new Dimension(400, 300));
         
        panel1.add(saveButton);
        panel1.add(exitButton);
        frame.add(panel1);
        frame.setVisible(true);

    }

    public void doLoad() {

    }

    public void doSave() {

    }

    public void doQuit() {
        this.dispose();
    }

    public void initInterface() {

        points.addMouseListener(new MouseListener() {
            //get the onscreen coordinates for the mouse location
            public void createPonit(MouseEvent e) {

                point.setBounds(C1, C2, 400, 300);

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> launch());
    }

    private static class points {

        private static void addMouseListener(MouseListener mouseListener) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public points() {
        }
    }

    private static class point {

        private static void setBounds(PageAttributes.MediaType C1, PageAttributes.MediaType C2, int i, int i0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public point() {
        }
    }


}
