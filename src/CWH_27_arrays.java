public class CWH_27_arrays {
    public static void main(String[] args) {
        /*int [] marks = {98, 45, 79, 99, 80};
        float[] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
        System.out.println(marks.length);
        System.out.println(marks[2]);

        String [] students = {"Namit", "Rajesh", "Shubham"};
        System.out.println(students.length);
        System.out.println(students[1]);*/

        int[] marks = {98, 45, 79, 99, 80};
        //System.out.println(marks.length);

        // Displaying the arrays (Naive way)
        System.out.println("Displaying the arrays in naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the arrays (For loop)
        //System.out.println("Displaying the arrays in for loop");
        //for (int i = 0; i < marks.length; i++) {
            //System.out.println(marks[i]);
        //}

        // Quick Quiz
        int[] marks1 = {98, 45, 79, 99, 80};
        System.out.println("Displaying the arrays in reverse order (for loop)");
        for (int i = marks.length -1; i>=0; i--) {
            System.out.println(marks1[i]);
        }
        // Displaying the arrays (For-each loop)
        System.out.println("Displaying the arrays in reverse orde (for each loop)");
        for (int element: marks1) {
            System.out.println(element);
        }
    }
}



















