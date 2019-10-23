package io.littleworld;

import java.awt.*;

public class Rect extends Figure {


    @Override
    public void draw(Graphics g) {
        g.drawRect(x1, y1, x2-x1, y2-y1);
    }
}
