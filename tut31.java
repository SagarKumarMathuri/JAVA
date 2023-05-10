import java.util.*;
public class tut31{
    public static void main (String[] args){
      /*  input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
       */
      /*  Scanner  sc = new Scanner(System.in);
       int age = sc.nextInt(); 
       if(age>18){
        System.out.println("adult");
       }
       else{
        System.out.println("not adult");
        */
       /*  Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
       */
      /*  Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       if(a == b){
        System.out.println("equal");
       }
       else if(a > b){
        System.out.println("a is greater");
       }
       else{
        System.out.println("b is lesser");
       }
       */
       Scanner sc = new Scanner(System.in);
       int button = sc.nextInt();

       /* if(button == 1){
        System.out.println("Hello");
       }
       else if(button == 2){
        System.out.println("Namste");
       }
       else if (button == 3){
        System.out.println("manakam");
       }
       else{
        System.out.println("Invalid ");
       }
       */
       switch (button) {
        case 1:
            System.out.println("Hello");
            break;
        case 2:
            System.out.println("Namste");
            break;
        case 3:
            System.out.println("Manakam");
            break;
        default:
        System.out.println("Invalid");
       }
    }

}