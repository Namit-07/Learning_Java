class Employee{
    int id; // Attribute 1
    int salary; // Attribute 2
    String name; // Attribute 3
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
    }
    public int getSalary(){
        return salary ;
    }

}
public class CWH_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee(); // Instantiating a new Employee Object

        // Setting properties
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";

        harry.printDetails();
        int salary = harry.getSalary();
        System.out.println(salary);

        // Printing the Attributes
        //System.out.println(harry.id);
        //System.out.println(harry.name);

    }
}
