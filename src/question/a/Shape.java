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
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2= (Graphics2D) g;
        g2.draw(rect);
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return  height;
    }

}
