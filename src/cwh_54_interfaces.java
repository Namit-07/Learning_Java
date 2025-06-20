interface Bicycle{
    int a = 45; //The values given are final and cannot be changed
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface BicycleHorn{
    void BlowHornk2k();
    void BlowHornk3k();
}
class Firefox implements Bicycle, BicycleHorn{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Speeding up");
    }
    public void BlowHornk2k(){
        System.out.println("Dil Ke Dewane pee pee pee");
    }
    public void BlowHornk3k(){
        System.out.println("Fulon ke Dewane poo poo poo");
    }
}

public class cwh_54_interfaces {
    public static void main(String[] args) {
        Firefox madrock = new Firefox();
        madrock.applyBrake(45);
        // You can create properties in Interfaces
        System.out.println(Firefox.a);
        // You cannot modify the properties in Interfaces as they are final
        // Firefox.a = 445;
        madrock.blowHorn();
        madrock.BlowHornk2k();
        madrock.BlowHornk3k();


    }
}
