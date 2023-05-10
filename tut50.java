// OOPS 

class Pen {
    String color;
    String type; // ballpen, gel

    public void write() {
        System.out.println("writing something");
    }
}

public class tut50 {

   public static void main(String args[]) {
    Pen pen1 = new Pen();
    pen1.color = "red";
    pen1.type = "gel";

    pen1.write();
   } 
}
