import question.a.GeometricShape;
import question.a.Shape;
import question.b.ModemImplementation;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // question a
        System.out.println("Question A:");
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

        // question b
        System.out.println("Question B:");
        ModemImplementation modem = new ModemImplementation("12345678");
        modem.dial("11111111");
        modem.send('c');
        modem.hangup();
    }
}