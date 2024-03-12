public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("krug1", 4);
        circle.calculateArea();
        circle.printAreaKrug();

        Rectangle rectangle = new Rectangle("прямоугольник_1", 2, 3);
        rectangle.printAreaRectangle();
        rectangle.printPerimeterRectangle();
       
    }
    
    
}
