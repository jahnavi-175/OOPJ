import java.util.Scanner;

class Account {
    float acc_no, bal;
    void input(Scanner obj){
        System.out.println("Enter Account no. and balance:");
        acc_no = obj.nextFloat();
        bal = obj.nextFloat();
    }
    void disp(){
        System.out.println("Account no: "+acc_no+" and balance: "+bal);
    }
}
class Person extends Account {
    String name;
    long aadhar_no;
    void input(Scanner obj){
        System.out.println("Enter Name and Aadhar no.:");
        name = obj.next();
        aadhar_no = obj.nextLong();
        super.input(obj);
    }
    void disp(){
        System.out.print("Name: "+name+" and Aadhar no.: "+aadhar_no+" has ");
        super.disp();
    }

}
public class Accdetails {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Person[] p = new Person[3];
        for(int i=0 ; i<3 ; i++){
            System.out.println("Enter details of person"+(i+1));
            p[i] = new Person();
            p[i].input(obj);
        }
        System.out.println("Details:");
        for(int i=0; i<3; i++){
            p[i].disp();
        }
        obj.close();
    }
}
