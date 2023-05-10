public class tut22 {
    public static void main(String[] args) {
        // Precedence & Associativity
        //int a = 6*5-34/2;
        /*
        Highest precedence goes to * and / . they are then evaluated on the basic
        of left to right associativity
           = 30-34/2;
           = 30-17
           = 13
         */
        //int b = 60/5-34*2;
        /*
           = 12-34*2
           = 12-68
           = -56
         */
        //System.out.println(a);
        //System.out.println(b);
        // Quick Quiz 
         //int x = 4;
         //int y = 3;
         //int k = x * y/2;

         int a = 4;
         int c = 5;
         int b = 2;
         int k = b*b - (4*a*c)/(2*a);
         System.out.println(k);
    }
}
