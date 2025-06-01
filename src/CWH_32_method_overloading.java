public class CWH_32_method_overloading {
    static void foo(){
        System.out.println("Good morning bro!!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " Bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " and " + b + " Bro!");
    }

    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new Joke!!\n"
                +"Plagiarism");
    }
    public static void main(String[] args) {
        //tellJoke();
        //int [] marks = {10, 98, 558, 34, 90};
        // Case 1: Changing the Integer
        //int x = 10;
        //change(x);
        //System.out.println("The value of x after running change is: " + x);

        // Case 2: Changing the Array
        //change2(marks);
        //System.out.println("The value of x after running change2 is: " + marks[0]);

        // Case 3: Method Overloading
        foo();
        foo(3000);
        foo(10, 20);
        // Arguments are actual!




    }
}
