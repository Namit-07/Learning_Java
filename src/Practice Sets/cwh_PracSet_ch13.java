class Greet extends Thread{
    public void run(){
        while(true){
            System.out.println("Good morning");
        }
    }
}
class Welcome extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}

public class cwh_PracSet_ch13 {
    public static void main(String[] args) {
        // Question 1.
         Greet g1 = new Greet();
         Welcome w1 = new Welcome();
         // g1.start();
         // w1.start();

        // Question 2.
        // add a delay of 200ms

        // Question 3.
        g1.setPriority(6);
        w1.setPriority(9);
        System.out.println(g1.getPriority());
        System.out.println(w1.getPriority());

        // Question 4
        System.out.println(w1.getState());
        System.out.println(g1.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
