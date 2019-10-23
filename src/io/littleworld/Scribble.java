package io.littleworld;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Scribble extends JFrame implements MouseListener {


    Oval fig = new Oval();

    public Scribble() throws HeadlessException {
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        fig.draw(g);
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
        fig.x1 = e.getX();
        fig.y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("released");
        fig.x2 = e.getX();
        fig.y2 = e.getY();
        repaint();
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
