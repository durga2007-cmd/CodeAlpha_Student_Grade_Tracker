
import java.util.*;
public class GradeTracker {
    private ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student newstudent) {
        students.add(newstudent);
    }

    void displayAllStudents() {
        for (Student stud : students)
            System.out.println(stud);
    }

    void searchStudent(int Rollno) {
        for (Student stud : students) {
            if (stud.getrollno() == Rollno) {
                System.out.println("Student Found");
                System.out.println(stud);
            }
        }
    }

    void deleteStudent(int rn) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student stud = iterator.next();
            if (stud.getrollno() == rn) {
                iterator.remove();
                System.out.println("Deleted Successfully");
                return;
            }
        }
        System.out.println("Student not found");
    }

    void updateStudent(int ron, int newmark) {
        for (Student stud : students) {
            if (stud.getrollno() == ron) {
                stud.setmark(newmark);
                System.out.println("updated Successfully");
                return;
            }
        }
        System.out.println("Student not found");
    }



        void CalculateAverage () {
        if(students.isEmpty())

        {
            System.out.println("No students available.");
            return;
        }
        int total = 0;
        for (Student stud : students) {
            total = total + stud.getmarks();


        }
            double average = (double) total / students.size();
            System.out.println("Average Marks: " + average);
    }
    void highestmarks(){
        if(students.isEmpty())

        {
            System.out.println("No students available.");
            return;
        }
        int highest=students.get(0).getmarks();
        String topper=students.get(0).getname();
        for(Student stud:students){
            if(stud.getmarks()>highest){
                highest=stud.getmarks();
                topper=stud.getname();

            }
        }
        System.out.println("Highest mark: "+highest );
        System.out.println("Topper Name: "+topper);

    }
    void Lowestmarks(){
        if(students.isEmpty())

        {
            System.out.println("No students available.");
            return;
        }
        int Lowest=students.get(0).getmarks();
        String Studname=students.get(0).getname();
        for(Student stud:students){
            if(stud.getmarks()<Lowest){
                Lowest=stud.getmarks();
                Studname=stud.getname();


            }
        }
        System.out.println("Lowest mark: "+Lowest);
        System.out.println("student Name: "+Studname);

    }
    void summaryReport() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        int total = 0;
        int highest = students.get(0).getmarks();
        int lowest = students.get(0).getmarks();

        for (Student stud : students) {

            total += stud.getmarks();

            if (stud.getmarks() > highest) {
                highest = stud.getmarks();
            }

            if (stud.getmarks() < lowest) {
                lowest = stud.getmarks();
            }
        }

        double average = (double) total / students.size();

        System.out.println("\n========== Summary Report ==========");
        System.out.println("Total Students : " + students.size());
        System.out.println("Average Marks  : " + average);
        System.out.println("Highest Marks  : " + highest);
        System.out.println("Lowest Marks   : " + lowest);
        System.out.println("====================================");
    }

    }

