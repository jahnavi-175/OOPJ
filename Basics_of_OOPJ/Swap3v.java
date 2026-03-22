public class Swap3v {
    public static void main(String[] args) {
        int a=1 , b=2, temp;
        System.out.println("Initially: a="+a+ " b="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("Swapped: a="+a+ " b="+b);
    }
}