import java.io.*;
import java.util.Scanner;

public class FileData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = sc.nextLine();

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;

            while((line = br.readLine()) != null) {
                lines++;
                characters += line.length();

                String[] wordList = line.trim().split("\\s+");
                if(line.trim().length() > 0)
                    words += wordList.length;
            }

            br.close();

            System.out.println("No. of characters - " + characters);
            System.out.println("No. of lines - " + lines);
            System.out.println("No. of words - " + words);
        }
        catch(IOException e) {
            System.out.println(e);
        }
        sc.close();
    }
}