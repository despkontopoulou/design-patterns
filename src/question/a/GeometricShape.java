package question.a;

public class GeometricShape {
    private Shape drawnShape;

    public GeometricShape(Shape shape) {
    this.drawnShape = shape;
    }
    public int getXLowerRightCorner(){
        return drawnShape.getWidth();
    }
    public int getYLowerRightCorner(){
        return drawnShape.getHeight();
    }
}
//1 field, 4 methods
//method uses of field: 3
//LCOM= 1-(3/3*1)=0
