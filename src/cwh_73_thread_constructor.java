class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<50) {
            System.out.println("I am a thread");
            i++;
        }
    }
}
public class cwh_73_thread_constructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Namit");
        MyThr t2 = new MyThr("Ronaldo");
        t.start();
        t2.start();
        System.out.println("The id of the thread t is " + t.getId());
        System.out.println("The name of the thread t is " + t.getName());
        System.out.println("The id of the thread t2 is " +t2.getId());
        System.out.println("The name of the thread t is " +t2.getName());

    }
}
