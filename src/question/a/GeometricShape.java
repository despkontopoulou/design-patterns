package question.a;

public class GeometricShape {
    private Shape drawnShape;

    public GeometricShape(Shape shape) {
    this.drawnShape = shape;
    }
    public int getXLowerRightCorner(){
        return drawnShape.getXLowerRightCorner();
    }
    public int getYLowerRightCorner(){
        return drawnShape.getYLowerRightCorner();
    }
}
