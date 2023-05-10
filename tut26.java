public class tut26 {
    public static void main(String[] args) {
        /*
         Classroom of 500 students - you have to store marks of these 500 students 
         you have two option:
         1.Create 500 variables
         2.Use Arrays (recommended)
         */
        // There are three main way to create an array in java
        // 1. Declaration and memory allocation
        // int[] marks = new int[5];

        // 2. Declaration and then memory alloction
        // int[] marks;
        // marks = new int[5];
        // initialization
       // marks[0] = 100;
       // marks[1] = 60;
       // marks[2] = 70;
       // marks[3] = 90;
       // marks[4] = 86;

       // 3. Declaration, memory allocation and initialiation together
       int[] marks = {98, 45, 65, 78,90};

       
        System.out.println(marks[4]);
    }
}
