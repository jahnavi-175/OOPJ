import java.util.Scanner;
class HrsException extends Exception{
    public HrsException(String message){
        super(message);
    }
}
class MinException extends Exception{
    public MinException(String message){
        super(message);
    }
}
class SecException extends Exception{
    public SecException(String message){
        super(message);
    }
}
public class TimeEx {
    static void time(int h, int m, int s){
        int f=1;
        try{
            if(h>24||h<0)
                throw new HrsException("Hours not between 0-24");
        }
        catch(HrsException e){
            System.out.println("Caught an exception");
            e.printStackTrace();
            f=0;
        }
        try{
            if(m>60||m<0)
                throw new MinException("Minutes not between 0-60");
        }
        catch(MinException e){
            System.out.println("Caught an exception");
            e.printStackTrace();
            f=0;
        }
        try{
            if(s>60||s<0)
                throw new SecException("Seconds not between 0-60");
        }
        catch(SecException e){
            System.out.println("Caught an exception");
            e.printStackTrace();
            f=0;
        }
        if(f==1)
            System.out.println("Correct time: "+h+":"+m+":"+s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int h = sc.nextInt();
        System.out.print("Enter minutes: ");
        int m = sc.nextInt();
        System.out.print("Enter seconds: ");
        int s = sc.nextInt(); 
        
        time(h, m, s);
        
        sc.close();
    }
}
