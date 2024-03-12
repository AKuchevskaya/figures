public class Square extends Rectangle {

    public Square(String n, int l) {
        super(n, l, 0);
    }
    public double calculateArea(){
        double area = getLength() * getLength();
        return area;
    }

    public double calculatePerimeter(){
        double circumference = 4 * getLength();
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
