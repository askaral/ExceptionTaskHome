public class Cylinder implements Service{
    private double height;
    private double radius;
    private final double PI = 3.14;

    public Cylinder() {
    }

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double area() {
        double sum = 0;
        sum = 2 * PI * radius * (height + radius);
        return  (sum * 100.0) / 100.0;
    }

    @Override
    public double volume() {
        double sum = 0;
        sum = PI * radius * radius * height;
        return (sum * 100.0) / 100.0;
    }
}
