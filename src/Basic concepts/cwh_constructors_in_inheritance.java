class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value x as: " + x);
    }

}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a derived constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor with value y as: " + y);
    }

}

public class cwh_constructors_in_inheritance {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        //Derived1 d = new Derived1();
        Derived1 d = new Derived1(10, 20);

    }
}
