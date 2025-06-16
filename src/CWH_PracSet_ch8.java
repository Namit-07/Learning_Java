class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class Cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
}
class Square{
    int side;
    public int Area(){
        return side*side;
    }
    public int Perimeter(){
        return 4*side;
    }
}
class Rectangle{
    int length;
    int breath;
    public int Area(){
        return length*breath;
    }
    public int Perimeter(){
        return 2*(length+breath);
    }
}
class Tommy{
    public void hitting(){
        System.out.println("Hitting the enemy");
    }
    public void running(){
        System.out.println("Running to kill the enemy");
    }
    public void firing(){
        System.out.println("Firing the enemy");
    }
}
class Circle{
    int radius;
    public float area(){
        return 3.14f*radius*radius;
    }
    public float perimeter(){
        return 2*3.14f*radius;
    }
}


public class CWH_PracSet_ch8 {
    public static void main(String[] args) {
        // Question 1.
        Employee1 harry = new Employee1();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

        // Question 2.
        Cellphone apple = new Cellphone();
        apple.vibrating();
        apple.ringing();

        // Question 3.
        Square sq = new Square();
        sq.side = 5;
        System.out.println(sq.Area());
        System.out.println(sq.Perimeter());

        // Question 4.
        Rectangle rec = new Rectangle();
        rec.length = 4;
        rec.breath = 5;
        System.out.println(rec.Area());
        System.out.println(rec.Perimeter());

        // Question 5.
        Tommy player1 = new Tommy();
        player1.firing();
        player1.hitting();
        player1.running();

        // Question 6.
        Circle cir = new Circle();
        cir.radius = 10;
        System.out.println(cir.area());
        System.out.println(cir.perimeter());

    }
}
