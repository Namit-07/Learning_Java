class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * 3.14 * radius * radius + 2 * 3.14 * radius * height;
    }

    public double volume() {
        return 3.14 * radius * radius * height;
    }
}

class Rectangle1 {
    private int length1;
    private int breadth1;

    public Rectangle1() {
        this.length1 = 4;
        this.breadth1 = 5;
    }

    public Rectangle1(int length1, int breadth1) {
        this.length1 = this.length1;
        this.breadth1 = this.breadth1;
    }

    public int getLength() {
        return length1;
    }

    public int getBreadth() {
        return breadth1;
    }
}

public class CWH_PracSet_ch9 {
        public static void main(String[] args) {
            // Question 1.
            //Cylinder c = new Cylinder(5, 10);
            //c.setRadius(5);
            //System.out.println(c.getRadius());
            //c.setHeight(10);
            //System.out.println(c.getHeight());

            // Question 2.
            //System.out.println(c.surfaceArea());
            //System.out.println(c.volume());

            // Question 3.
            Rectangle r = new Rectangle();
            System.out.println(r.getClass());
            System.out.println(r.getClass());
        }
    }







