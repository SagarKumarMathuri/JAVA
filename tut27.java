public class tut27 {
    public static void main(String[] args) {
       /*  float[] marks = {45.6f, 89.9f, 56.8f, 52.0f};
       String[] students = {"sohan", "mohan","aman", "rohan"};
       System.out.println(students.length);
       System.out.println(students[3]);
       */
      int[] marks = {45,87,80,24,56};
     // System.out.println(marks.length);

     // Displaying the array (Naive way)
     System.out.println("Printing using naive way");
      System.out.println(marks[0]);
      System.out.println(marks[1]);
      System.out.println(marks[2]);
      System.out.println(marks[3]);
      System.out.println(marks[4]);

      // Displaying the array (for loop)
      System.out.println("printing using for loop");
      for(int i=0; i<marks.length;i++){
        System.out.println(marks[i]);
      }

      // Quick Quiz: Displaying the array in reverse order (for loop)
      System.out.println("printing using for loop in Reverse order");
      for(int i=marks.length -1; i>=0;i--){
        System.out.println(marks[i]);
    }

       // Displaying the array (for each loop)
      System.out.println("printing using for each loop"); 
      for(int element: marks){
        System.out.println(element);
      }
    } 
}
