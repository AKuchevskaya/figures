public class Rectangle extends Figures {

    public Rectangle(String n, int l, int w) {
        super(n, 0, l, w);
    }
    public double calculateArea(){
        double area;
        if (getWidth() !=0) {
            area = getLength() * getWidth();
        } else {
            area = getLength() * getLength();
        }
        return area;
    }

    public double calculatePerimeter(){
        double circumference;
        if (getWidth() !=0) {
            circumference = 2 * (getLength() + getWidth());
        } else {
            circumference = 4 * getLength();
        }
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
