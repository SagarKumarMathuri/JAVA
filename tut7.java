public class tut7 {
    public static void main(String[] args) {
        String levelString="expert";
        int level=0;
        switch(levelString){
            case "beginner":level=1;
            break;
            case "intermidiate":level=2;
            break;
            case "expert":level=3;
            break;
            default:level=0;
            break;
        }
        System.out.println("your level is:"+level);
    }
    
}
