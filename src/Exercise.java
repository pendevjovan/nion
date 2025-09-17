import java.util.ArrayList;
import java.util.List;
class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType.equals("Square")) {
            return new Circle();
        }
        if (shapeType.equals("Circle")) {
            return new Circle();
        } else {
            return null;
        }
    }
}
public class Exercise {
    public static void main(String[] args) {
        System.out.println("ShapeFactory");
    }

}
