public class ArithmeticEx {
    public static void main(String[] args){
        int r;
        try{
            r = 10/0;
            System.out.println(r);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("ArithmeticException caught by try-catch-finally block.");
        }
    }
}
