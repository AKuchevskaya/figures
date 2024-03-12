public class Circle extends Figures {

    public Circle(String n, double r) {
        super(n, r, 0, 0, 0);
    }

    //Площадь круга вычисляется по формуле = PI*radius*radius
    public double calculateArea(){
        double area = Math.PI * getRadius() * getRadius();
        return area;
    }

    //Длины окружности вычисляется по формуле = 2*PI*radius
    public double calculatePerimeter(){
        double circumference = Math.PI * 2 * getRadius();
        return circumference;
        // System.out.println("Длины окружности равна: " + circumference);
    }
    public void printPerimeterKrug() {
        printPerimeter();
        double circumference = calculatePerimeter();
        System.out.println("составляет " + circumference);
        System.out.println();
    }
    public void printAreaKrug(){
        printArea();
        double area = calculateArea();
        System.out.println("составляет " + area);
        System.out.println();
        // System.out.printf("%.2f\n","составляет " + area);
    }
    
}