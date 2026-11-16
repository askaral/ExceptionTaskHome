public class Parallelepiped implements Service{
    private int length;
    private int height;
    private int width;

    public Parallelepiped() {
    }

    public Parallelepiped(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double area() {
        int sum = 0;
        sum = 2 * (height * length) + (length * width) + (height * width);
        return sum;
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}
