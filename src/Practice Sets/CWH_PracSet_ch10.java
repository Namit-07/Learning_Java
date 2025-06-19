class Circle1{
    public int radius;

    Circle1(){
        System.out.println("I am a circle default constructor");
    }

    Circle1 (int r){
        System.out.println("I am a circle parameterized constructor");
        this.radius = r;
    }
    public double area() {
        return (3.14* radius * radius);
    }
}
class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am a cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return (3.14*radius *radius*height);
    }
}

public class CWH_PracSet_ch10 {
    public static void main(String[] args) {
        // Question 1.
        //Circle1 c1 = new Circle1(12);
        Cylinder1 c = new Cylinder1(12,4);

    }
}
