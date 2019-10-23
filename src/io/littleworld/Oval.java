package io.littleworld;

import java.awt.*;

public class Oval {
    int x1, y1, x2, y2;


    public void draw(Graphics g) {
        g.drawOval(x1, y1, x2-x1, y2-y1);
    }
}

