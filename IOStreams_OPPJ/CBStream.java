import java.io.*;
import java.util.Scanner;
public class CBStream {
    public static void main(String[] args) {
        int ch, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Source file name: ");
        String src = sc.next();
        System.out.print("Destination file name(Char stream): ");
        String dest1 = sc.next();
        System.out.print("Destination file name(Byte stream): ");
        String dest2 = sc.next();

        try{
            FileWriter fw = new FileWriter(dest1);
            FileReader fr = new FileReader(src);

            while((ch=fr.read()) != -1)
                fw.write(ch);
            fw.close();
            fr.close();

            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest2);

            while((b=fis.read()) != -1)
                fos.write(b);
            fis.close();
            fos.close();

            System.out.println("File Copied");
        }
        catch(Exception e){
            System.out.println("Exception Caught: " +e.getMessage());
        }
        sc.close();
    }
}
