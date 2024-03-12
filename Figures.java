public class Figures {
    private String name;
    private int radius;
    private int length;
    private int width;

    public Figures(String n, int r, int l, int w){
        name = n;
        radius = r;
        this.length = l;
        this.width = w;
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

    public void printArea(){
        System.out.println("площадь фигуры " + name + " с параметрами:" + "\n" + "радиус=" + radius + "\n" + "длинна=" + length + "\n" + "ширина=" + width + "\n");
    }

    public void printPerimeter(){
        System.out.println("периметр фигуры " + name + " с параметрами:" + "\n" + "радиус=" + radius + "\n" + "длинна=" + length + "\n" + "ширина=" + width + "\n");
    }
}
