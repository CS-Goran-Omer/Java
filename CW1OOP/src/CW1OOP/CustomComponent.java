/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW1OOP;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JComponent;

/**
 *
 * @author user
 */
public class CustomComponent extends JComponent  {
        private BufferedImage image;

    public CustomComponent(File imageFile) {
        setPreferredSize(new Dimension(400, 400));
        setBorder(BorderFactory.createTitledBorder("My Component"));
        try {
            this.image = ImageIO.read(imageFile);
        } catch (IOException x) {
            x.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g = g.create();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        int margin = 20;
        int w = (getWidth() - (2 * margin + 2)) / 2;
        int h = this.image.getHeight() * w / this.image.getWidth();

        g.drawImage(this.image, margin, margin, w, h, this);
        g.drawImage(this.image, margin + w + 2, margin, w, h, this);
        g.drawImage(this.image, margin, margin + h + 2, w, h, this);
        g.drawImage(this.image, margin + w + 2, margin + h + 2, w, h, this);
    }
}


