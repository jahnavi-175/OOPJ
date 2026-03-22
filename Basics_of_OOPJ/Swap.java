public class Swap {
    public static void main(String[] args) {
        int a=1 , b=2;
        System.out.println("Initially: a="+a+ " b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapped: a="+a+ " b="+b);
    }
}