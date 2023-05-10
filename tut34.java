import java.util.*;

public class tut34{
    public static void main(String[] args) {
       /* 
       1.
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("My Name is : "+ name);
        */
        // 2.
        // Concatenation
        String firstName = "Sagar";
        String secondName = "Mathur";
        String fullName = "Sagar" + "@" + "Mathur";
        System.out.println(fullName);
        // What is length of Sagar@Mather
        System.out.println(fullName.length());

        // charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
        // Compare
        String name1 = "Sagar";
        String name2 = "Sagar8";

        if(name1.compareTo(name2) == 0){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
    }
}