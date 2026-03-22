import java.util.Scanner;
import java.io.*;
public class SDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rollno, name, subject & marks of student:");
        int rollno = sc.nextInt();
        String name = sc.next();
        String subject = sc.next();
        String marks = sc.next();
        
        System.out.print("Enter name of file: ");
        String filename = sc.next();
        int i;
        try{
            FileWriter fw = new FileWriter(filename);
            
            fw.write("Roll no.: " +rollno);
            fw.write("\nName: " +name);
            fw.write("\nSubject: "+subject);
            fw.write("\nMarks: " +marks);

            fw.close();

            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Reading from file...");
            while((i=br.read()) != -1)
                System.out.print((char)i);
            br.close();
            fr.close();
        }
        catch(Exception e){
            System.out.println("Exception caught: " +e.getMessage());
        }
        sc.close();
    }

}
