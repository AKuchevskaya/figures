public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("круг_1", 4);
        Rectangle rectangle = new Rectangle("прямоугольник_1", 2, 3);
        Square square = new Square("квадрат_1", 8);

        circle.printAreaCircle();
        circle.printPerimeterCircle();

        rectangle.printAreaRectangle();
        rectangle.printPerimeterRectangle();

        square.printAreaRectangle();
        square.printPerimeterRectangle();
    }
    
    
}
