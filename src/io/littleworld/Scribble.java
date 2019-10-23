package io.littleworld;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Scribble extends JFrame implements MouseListener {

    public Scribble() throws HeadlessException {
        addMouseListener(this);
    }

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



    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }
}
