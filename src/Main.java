import question.a.GeometricShape;
import question.a.Shape;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape myShape = new Shape();
        GeometricShape myGeometricShape = new GeometricShape(myShape);

        JFrame f = new JFrame();
        f.setSize(600, 600);
        f.setContentPane(myShape);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myShape.draw();// 1st app
        f.setVisible(true);
        //2nd app
        System.out.println("Lower right corner x:"+myGeometricShape.getXLowerRightCorner()+
                " y:"+myGeometricShape.getYLowerRightCorner());
    }
}