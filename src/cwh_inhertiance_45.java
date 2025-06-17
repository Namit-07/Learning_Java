class Base{
    public int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
}
class Derived extends Base{
    public int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
class Animal {
    public String name;
    public int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animal{
    public String action;

    public String getAction(){
        return action;
    }
    public void setAction(String action){
        this.action = action;
    }
}

public class cwh_inhertiance_45 {
    public static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();
        b.setX(10);
        System.out.println(b.getX());

        // Creating an Object of derived class
        Derived d = new Derived();
        d.setY(20);
        System.out.println(d.getY());

        // Quick Quiz
        // Base
        Animal a = new Animal();
        a.setName("Tommy");
        a.setAge(10);
        System.out.println(a.getName());
        System.out.println(a.getAge());

        // Derived
        Dog d1 = new Dog();
        d1.setAction("Barking");
        System.out.println(d1.getAction());



    }
}
