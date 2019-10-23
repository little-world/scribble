package io.littleworld;

import javax.swing.*;
import java.awt.*;

public class Scribble extends JFrame {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(20, 20, 100, 100);
    }

    public static void main(String[] args) {
	// write your code here
        Scribble scribble = new Scribble();
        scribble.setSize(400, 400);
        scribble.setVisible(true);
        scribble.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
