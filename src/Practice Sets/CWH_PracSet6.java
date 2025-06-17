public class CWH_PracSet6 {
    public static void main(String[] args) {
        // Question 1.
        /* float [] marks = {90.5f, 85.5f, 95.5f, 100.7f};
        float sum = 0;
        for (float element:marks){
        sum = sum + element;
        }
        System.out.println("The sum of the marks is: " + sum); */

        // Question 2.
        /* float[] marks = {90.9f, 85.5f, 95.3f, 100.7f};
        float num = 95.3f;
        boolean isInArray = false;
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the array");
        } else {
            System.out.println("The value is not present in the array");
        }*/

        // Question 3.
        /* float [] marks = {90.9f, 85.5f, 95.3f, 100.7f};
        float avg = 0;
        for (float element : marks) {
            avg = avg + element;
        }
        System.out.println(" The value of the avg marks is: " + avg/marks.length); */

        // Question 4.
        /*int [][] mat1= {{1,2,3},
                        {4,5,6},};
        int [][] mat2= {{2,6,13},
                        {3,7,1},};
        int [][] result={{0,0,0},
                        {0,0,0},};
         for(int i=0; i<mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                //System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i=0; i<mat1.length;i++) {
            for (int j=0; j<mat1[i].length;j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); */

        // Question 5.
        /*int[] blah = {98, 90, 100, 56, 34};
        for (int i =blah.length -1; i>=0; i--) {
            System.out.println(blah[i]);
        }*/

        // Question 6.
         int [] array = {98,56,144,18,19,10};
        int max = 0;
        for (int e: array){
            if (e>max){
                max = e;
            }
        }
        System.out.println("The maximum value is: " + max);
    }
}



















