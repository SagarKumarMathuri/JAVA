// FUNCTION AND METHODS 
import java.util.*;
public class tut32 {

/* 
    //  1. Print a Given name in a function

public static void printMyName(String name) {
    System.out.println(name);
    return;
}

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String name = sc.next();

    printMyName(name);// call kiya function ko
    }
*/
/* 
// 2. Make a Function to add 2 numbers and return the sum

public static int calculateSum(int a, int b){
    int sum = a + b;
    return sum;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = calculateSum(a,b);
    System.out.println("Sum of Two number is:"+ sum);

}
*/

/* 
// 3. Make a Function to Multiply 2 numbers and return the product

public static int calculateProduct(int a, int b){
    return a * b;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("Product of 2 number is:"+ calculateProduct(a,b));
}
*/


// 4. Find the factorial of a number.

public static void printFactorial(int n){
    // loop
    if(n < 0){
        System.out.println("Invalid Number");
        return;
    }
    int factorial = 1;
    for(int i=n; i>=1; i--){
        factorial = factorial * i;
    }
    System.out.println(factorial);
    return;
}
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    printFactorial(n);
}
}
