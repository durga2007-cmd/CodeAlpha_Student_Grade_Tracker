import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeTracker tracker = new GradeTracker();
        while (true) {
            System.out.println("\n===== Student Grade Tracker =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6.Calculate Average");
            System.out.println("7.Calculate Highest Mark");
            System.out.println("8.Calculate Lowest Marks:");
            System.out.println("9.Summary Report");
            System.out.println("10. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a Name ");
                    sc.nextLine();
                    String name=sc.nextLine();
                    System.out.println("Enter a Rollno");
                    int rollno=sc.nextInt();
                    System.out.println("Enter marks");
                    int marks=sc.nextInt();
                    Student s=new Student(name,rollno,marks);
                    tracker.addStudent(s);
                    System.out.println("Student added successfully");
                    break;
                case 2:
                    tracker.displayAllStudents();
                    break;
                case 3:
                    System.out.println("Enter Rollno to Search:");
                    int Rollno=sc.nextInt();
                    tracker.searchStudent(Rollno);
                    break;
                case 4:
                    System.out.println("Enter Rollno to update:");
                    int ron=sc.nextInt();
                    System.out.println("Enter new Mark");
                    int newmark=sc.nextInt();
                    tracker.updateStudent(ron,newmark);
                    break;
                case 5:
                    System.out.println("Enter Rollno to delete");
                    int rn=sc.nextInt();
                    tracker.deleteStudent(rn);
                    break;
                case 6:
                    tracker.CalculateAverage();
                    break;
                case 7:
                    tracker.highestmarks();
                    break;
                case 8:
                    tracker.Lowestmarks();
                    break;
                case 9:
                    tracker.summaryReport();
                    break;
                case 10:
                    System.out.println("EXIT!");
                    return;
                default:
                    System.out.println("Invalid choice");


            }


        }
    }
}
