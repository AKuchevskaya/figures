public class Figures {
    private String name;
    private static double radius;
    private int length;
    private int width;
    private int side;

    public Figures(String n, double r, int l, int w, int s){
        name = n;
        radius = r;
        this.length = l;
        this.width = w;
        this.side = s;
    }
    public double getRadius(){
        return radius;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getSide(){
        return side;
    }

    public void printArea(){
        System.out.println("площадь фигуры " + name + " с параметрами:" + "\n" + "радиус=" + radius + "\n" + "длинна=" + length + "\n" + "ширина=" + width + "\n" + "сторона=" + side + "\n");
    }
    public void printPerimeter(){
        System.out.println("периметр фигуры " + name + " с параметрами:" + "\n" + "радиус=" + radius + "\n" + "длинна=" + length + "\n" + "ширина=" + width + "\n" + "сторона=" + side + "\n");
    }
}
