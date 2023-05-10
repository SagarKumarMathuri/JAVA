//import java.util.Scanner;
public class tut17
{
    public static void main(String[] args) {
        int marks=70;
       // System.out.println(
          //  "Enter is your marks");
       // Scanner sc=new  Scanner(System.in);
        //marks=sc.nextInt();
        if(marks<30){
            System.out.println("fail");
        }
        else if(marks>=90 && marks<100){
            System.out.println("d grade");
        }
        else if(marks>=80 && marks<90){
            System.out.println("c grade");
        }
        else if(marks>=70 && marks<80){
            System.out.println("b grade");
        }
        else if(marks>=60 && marks<70){
            System.out.println("a grade");
        }
        else{
            System.out.println("invalid");
        }

    }
    
}
