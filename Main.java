public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("круг_1", 4);
        circle.calculateArea();
        circle.printAreaKrug();

        Rectangle rectangle = new Rectangle("прямоугольник_1", 2, 3);
        rectangle.printAreaRectangle();
        rectangle.printPerimeterRectangle();

        Square square = new Square("квадрат_1", 8);
        square.printAreaRectangle();
        square.printPerimeterRectangle();
    }
    
    
}
