import java.util.Scanner;
public class OpString {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("\tMenu\n1.Change the case of the string\r\n" + //
                            "2.Reverse the string\r\n" + //
                            "3.Compare two strings\r\n" + //
                            "4.Insert one string into another string\r\n" + //
                            "5.Convert the string to upper case and lower case\r\n" + //
                            "6.Check whether the character is present in the string and at which position\r\n" + //
                            "7.Check whether the string is palindrome or not.\r\n" + //
                            "8.Check the number of word, vowel and consonant in the string"); 
            String s1 = null;
            String s2 = null;
            char ch = '0';
            String rev = " ";
        do{
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    s1 = sc.next();
                    System.out.println("Case changed string: " +s1.toUpperCase());
                    System.out.println("Case changed string: " +s1.toLowerCase());
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    s1 = sc.next();
                    for(int i=s1.length()-1; i>=0; i--){
                        rev += s1.charAt(i);
                    }
                    System.out.println("Reversed String: " +rev);
                    break;
                case 3:
                    System.out.print("Enter a string: ");
                    s1 = sc.next();
                    System.out.print("Enter 2nd string:");
                    s2 = sc.next();
                    int dif = s1.compareTo(s2);
                    System.out.println("ASCII Difference: " +dif);
                    break;
                case 4:
                    System.out.print("Enter a string: ");
                    s1 = sc.next();
                    System.out.print("Enter 2nd string:");
                    s2 = sc.next();
                    String s3 = s1.concat(s2);
                    System.out.println("Concantenated: " +s3);
                    break;
                case 5:
                    System.out.print("Enter a string: ");
                    s1 = sc.next();
                    System.out.println("Uppercase: " +s1.toUpperCase());
                    System.out.println("Lowercase: " +s1.toLowerCase());
                    break;
                case 6:
                    System.out.print("Enter a string: ");
                    s1 = sc.next();
                    System.out.print("Enter character to be found: ");
                    char c = sc.next().charAt(0);
                    int pos = s1.indexOf(c);
                    if(pos != -1) System.out.println("Position of character: " +pos);
                    else System.out.println("Character not found!");
                    break;
                case 7:
                    System.out.print("Enter a string: ");
                    String str = sc.next();
                    String rev1 = "";
                    for(int i=str.length()-1; i>=0; i--){
                        rev1 += str.charAt(i);
                    }
                    if(rev1.equalsIgnoreCase(str)) System.out.println("String is Palindrome.");
                    else System.out.println("String is not Palindrome.");
                    break;
                case 8:
                    sc.nextLine();
                    System.out.println("Enter a sentence: ");
                    String sen = sc.nextLine();
                    int words = sen.trim().split("\\s+").length;
                    int v=0, co=0;
                    for(int i=0; i<sen.length(); i++){
                        ch = Character.toLowerCase(sen.charAt(i));
                        if(Character.isLetter(ch)){
                            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') v++;
                            else co++;
                        }                        
                    }
                    System.out.println("No. of words: " +words);
                    System.out.println("No. of vowels: " +v+ "\nNo. of consonants: " +co);
                    break;
                case 9:
                    System.out.println("Exiting......");
                    break;
                default:
                    System.out.println("Enter choice between 1-8");
                    break;
            }
        }while(choice != 9);
        sc.close();
    }
}
