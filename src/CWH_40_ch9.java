class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public class CWH_40_ch9 {
    public static void main(String[] args) {
        MyEmployee Namit = new MyEmployee();
        // Namit.id = 45;
        // Namit.name= "CodeWithNamit"; --> Throws an error due to private access modifier
        Namit.setName("CodeWithNamit");
        System.out.println(Namit.getName());
    }
}






