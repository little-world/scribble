package io.littleworld;

import java.awt.*;

public class Rect {
    int x1, y1, x2, y2;


    public void draw(Graphics g) {
        g.drawRect(x1, y1, x2-x1, y2-y1);
    }
}
