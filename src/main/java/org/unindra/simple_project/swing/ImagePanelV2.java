package org.unindra.simple_project.swing;

import javax.swing.*;
import java.awt.*;

public class ImagePanelV2 extends JPanel {

    private ImageIcon image;

    public ImagePanelV2() {
        super();
    }

    public void setImage(Icon icon) {
        this.image = (ImageIcon) icon;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g.create();

        if (image != null) {
            graphics2D.drawImage(image.getImage(), 0, 0, getWidth(), getHeight(), null);
        }

        graphics2D.dispose();
    }
}
