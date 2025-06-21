abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Change the nib");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
     public void jump(){
         System.out.println("Jump");
     }
     public void bite(){
         System.out.println("Bite");
     }
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Speaking...");
    }
    public void eat(){
        System.out.println("Eat");
    }
    public void sleep(){
        System.out.println("Sleep");
    }
}
abstract class Phone3{
    abstract void ring();
    abstract void lift();
    abstract void disconnet();
}
class Telephone{
     void ring(){
         System.out.println("Ringing...");
     }
     void lift(){
         System.out.println("PickUp");
     }
     void disconnet(){
         System.out.println("Disconneting...");
     }
}
class Smartphone1{
    void ring(){
        System.out.println("Tring tring...");
    }
    void lift(){
        System.out.println("pickup the call");
    }
}
interface TvRemote{
    void switchOn();
    void switchOff();
}
interface SmartTvRemote extends TvRemote {
     void switchToNextChannel();
     void switchBackToPreviousChannel();
}
class Tv implements SmartTvRemote{
    public void switchOn(){
        System.out.println("Turn on the TV");
    }
    public void switchOff(){
        System.out.println("Turn off the TV");
    }
    public void switchToNextChannel(){
        System.out.println("Forward");
    }
    public void switchBackToPreviousChannel(){
        System.out.println("Back");
    }
}

public class CWH_PracSet_ch11 {
    public static void main(String[] args) {
        // Question 1.
        // FountainPen pen = new FountainPen();
        // pen.write();
        // pen.refill();

        // Question 2.
        // pen.changeNib();

        // Question 3.
        // Human namit = new Human();
        // namit.eat();
        // namit.sleep();

        // Question 4.
         Telephone t = new Telephone();
         t.disconnet();
         t.lift();
         t.ring();

         Smartphone1 s1 = new Smartphone1();
         s1.ring();
         s1.lift();
         // s1.disconnet(); --> Cannot use disconnet method because reference is smartphone which doesn't have this method

        // Question 5.
        // Monkey m1 = new Human();
        // m1.jump();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method

        // Q6 and Q7.
        Tv pana = new Tv();
        pana.switchOff();
    }
}
