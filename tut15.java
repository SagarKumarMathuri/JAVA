public class tut15 {
    public static void main(String[] args) {
        char branch='C';
        int collegeyear=4;
        switch(collegeyear){
            case 1:
            System.out.println("english,hindi,sanskrit,math,science");
            break;
            case 2:
            switch(branch){
                case 'C':
                System.out.println("operating system,software engineer,java,data struct");
                break;
                case 'E':
                System.out.println("micro processor,logic switching theory");
                break;
                case 'M':
                System.out.println("drawing,manufacturing manchine");
                break;
                case 3:
                switch(branch){
                    case 'C':
                    System.out.println("computer organization,multimedia");
                    break;
                    case 'E':
                    System.out.println("fundamental of logic design,microelctronic");
                    break;
                    case 'M':
                    System.out.println("internal combustion engines,mechanical vibration");
                    break;
                    case 4:
                    switch(branch){
                        case 'C':
                        System.out.println("data communication network,multimedia");
                        break;
                        case 'E':
                        System.out.println("embeded system,image processing");
                        break;
                        case 'M':
                        System.out.println("production technology,thermal engineering");
                        break;

                    }
                    break;
                }
            }
        }

    }
    
}
