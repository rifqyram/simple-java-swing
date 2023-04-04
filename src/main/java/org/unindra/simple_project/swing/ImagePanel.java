package org.unindra.simple_project.swing;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {

    private Image image;

    public ImagePanel() {
        super();
    }

    public void setImage(String resource) {
        this.image = new ImageIcon(getClass().getResource(resource != null ? resource : "/images/bg_main.png")).getImage();
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g.create();

        if (image != null) {
            graphics2D.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        }

        graphics2D.dispose();
    }
}
