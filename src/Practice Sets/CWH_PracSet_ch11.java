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
}

public class CWH_PracSet_ch11 {
    public static void main(String[] args) {

    }
}
