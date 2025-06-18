import java.awt.print.PrinterJob;

class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("My name is Java");
    }
}
class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("Apka swagat hai");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}
public class CWH_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        //Phone obj = new Phone(); // Allowed
        //SmartPhone apple = new SmartPhone(); // Allowed
        //obj.name();

        Phone obj = new SmartPhone(); // Allowed
        //SmartPhone obj2= new Phone(); // Not allowed

        obj.greet();
        obj.on();
        obj.music(); // Not allowed

    }
}
