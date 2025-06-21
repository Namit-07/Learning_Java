interface MyCamera2{
    void takeSnap();
    void recordVideo();

    default void record4kVideo(){
        System.out.println("Recording in 4k..."); // Once it is overridden it will not work
    }
}
interface MyWifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int number){
        System.out.println("Calling..." + number);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void connectToNetwork(String network){
        System.out.println("Connectin to" + network);
    }
    public void recordVideo(){
        System.out.println("Recording");
    }
    public String [] getNetworks(){
        System.out.println("Getting list of Networks");
        String [] networkList = {"Harry", "Namit", "Prashant"};
        return networkList;
    }
    public void record4kVideo(){
        System.out.println("Recording video in 4K");
    }
}
public class cwh_59_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2(); // this is a smartphone but, use it as a camera
        // cam1.getNetworks(); --> Not allowed
        // cam1.getMeth1(); --> Not allowed

        cam1.record4kVideo();

        MySmartPhone2 s = new MySmartPhone2();
        s.recordVideo();
        s.getNetworks();
        s.takeSnap();
        s.callNumber(96500);

    }
}

