//import javax.swing.SpringLayout;

public class tut1 {
    public enum day{ sun,mon,tues,wed,thur,fri,sat }
    public static void main(String[] args) {
        day[] daynow =day.values();
        for(day now:daynow)
        {
            switch(now){
                case sun:
                System.out.println("sunday");
                break;
                case mon:
                System.out.println("monday");
                break;
                case tues:
                System.out.println("tuesday");
                break;
                case wed:
                System.out.println("wednesday");
                break;
                case thur:
                System.out.println("thursday");
                break;
                case fri:
                System.out.println("friday");
                break;
                case sat:
                System.out.println("saturday");
                break;

        
            }
        }
    }
    
}
