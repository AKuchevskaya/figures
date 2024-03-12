public class Circle extends Figures {

    public Circle(String n, int r) {
        super(n, r, 0, 0);
    }

    public double calculateAreaCircle(){
        double area = Math.PI * getRadius() * getRadius();
        return area;
    }

    public double calculatePerimeterCircle(){
        double circumference = Math.PI * 2 * getRadius();
        return circumference;
    }

    public void printPerimeterCircle() {
        printPerimeter();
        double circumference = calculatePerimeterCircle();
        System.out.println("составляет " + circumference);
        System.out.println();
    }

    public void printAreaCircle(){
        printArea();
        double area = calculateAreaCircle();
        System.out.println("составляет " + area);
        System.out.println();
    }
    
}