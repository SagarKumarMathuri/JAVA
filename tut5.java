public class tut5 {
    public static void main(String[] args) {
        int day=57;
        String time="morning";
        switch (day){
         case 0:
         System.out.println("sunday");
         break;
         case 1:
         System.out.println("monday");
         break;
         case 2:
         System.out.println("tuesday");
         break;
         case 3:
         System.out.println("wednesday");
         break;
         case 4:
         System.out.println("thursday");
         break;
         case 5:
         System.out.println("friday");
         break;
         case 6:
         System.out.println("saturday");
         break;
        
         default:
         System.out.println("please provide proper day number");
        }
    }
    
}
