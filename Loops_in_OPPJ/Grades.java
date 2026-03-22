import java.util.Scanner;
public class Grades{
    public static void main(String[] args){
        System.out.println("Grades:");
        System.out.println("O:100-90, E:89-80, A:79-70, B:69-60, C:59-50, D:49-40, F<40");

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter marks(0-100):");
        int marks = obj.nextInt();
        System.out.println("Your marks is:" +marks);
        
        if(marks<=100 && marks>=90){
            System.out.println("Your grade is O.");
        }else if(marks<=89 && marks>=80){
            System.out.println("Your grade is E.");
        }else if(marks<=79 && marks>=70){
            System.out.println("Your grade is A.");
        }else if(marks<=69 && marks>=60){
            System.out.println("Your grade is B.");
        }else if(marks<=59 && marks>=50){
            System.out.println("Your grade is C.");
        }else if(marks<=49 && marks>=40){
            System.out.println("Your grade is D.");
        }else{
            System.out.println("Your grade is F.");
        }
    }
}
