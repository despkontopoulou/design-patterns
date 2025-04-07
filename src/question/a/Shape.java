package question.a;

import javax.swing.*;
import java.awt.*;

public class Shape extends JComponent {
    private int xUpperLeftCorner = 0;
    private int yUpperLeftCorner = 0;
    private int width = 200;
    private int height = 200;
    private Rectangle rect;

    public void draw(){
        rect= new Rectangle(xUpperLeftCorner, yUpperLeftCorner, width, height);
        this.repaint();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return  height;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        if (rect != null) {
            g2.draw(rect);
        }
    }
//5 fields, 5 methods,
// method uses of fields: 1(xUpperLeftCorner)+ 1(yUpperLeftCorner)+ 2(width)+2(height)+2(rect)= 8
// LCOM= 1-(8/(5*5))= 1-8/25= 1-0,32= 0,68
}
