import java.util.Scanner;

class Student {
    int Roll;
    String Name;
    float CGPA;

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = obj.nextInt();

        Student S[] = new Student[n];

        float minCGPA = Float.MAX_VALUE;
        String lowName = "";

        System.out.println("Enter Roll Name CGPA:");

        for (int i = 0; i < n; i++) {
            S[i] = new Student();

            S[i].Roll = obj.nextInt();
            S[i].Name = obj.next();      // one-word name
            S[i].CGPA = obj.nextFloat();

            if (S[i].CGPA < minCGPA) {
                minCGPA = S[i].CGPA;
                lowName = S[i].Name;
            }
        }
        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student"+(i+1)+":"+"\nRoll:" + S[i].Roll + " Name:" + S[i].Name + " CGPA:" + S[i].CGPA);
        }
        System.out.println("\nStudent with lowest CGPA: " + lowName);
    }
}

