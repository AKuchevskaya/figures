public class Rectangle extends Figures {

    public Rectangle(String n, int l, int w) {
        super(n, 0, l, w, 0);
    }
    public double calculateArea(){
        double area = getLength() * getWidth();
        return area;
    }

    public double calculatePerimeter(){
        double circumference = 2 * (getLength() + getWidth());
        return circumference;
    }
    public void printPerimeterRectangle() {
        printPerimeter();
        double circumference = calculatePerimeter();
        System.out.println("составляет " + circumference);
        System.out.println();
    }
    public void printAreaRectangle(){
        printArea();
        double area = calculateArea();
        System.out.println("составляет " + area);
        System.out.println();
    }
}
