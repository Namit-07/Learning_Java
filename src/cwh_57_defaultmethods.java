interface MyCamera{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("Recording in 4k..."); // Once it is overridden it will not work
    }
}
interface MyWifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int number){
        System.out.println("Calling..." + number);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
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

public class cwh_57_defaultmethods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
        String [] ar = ms.getNetworks();
        for(String item: ar) {
            System.out.println(item);
        }
    }
}
