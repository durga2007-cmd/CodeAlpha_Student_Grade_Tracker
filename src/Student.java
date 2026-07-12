public class Student{
        private String name;
        private int rollno;
        private int marks;
        Student(String name,int rollno,int marks){
            this.name=name;
            this.rollno=rollno;
            this.marks=marks;
        }
        public void setmark(int newmark){
            marks=newmark;
        }
        public String getname(){
            return name;
        }
        public int getrollno(){
            return rollno;
        }
        public int  getmarks(){
            return marks;
        }
    @Override
    public String toString() {
        return "Name: " + name +
                "\nRoll No: " + rollno +
                "\nMarks: " + marks +
                "\nGrade: " + calculateGrade();
    }
        public char calculateGrade(){
            if(marks>=90 && marks<=100){
                return 'A';
            } else if (marks >= 80 && marks < 90) {
                return 'B';
            }
            else if (marks >= 70 && marks < 80) {
                return 'C';
            }
            else if (marks >= 60 && marks < 70) {
                return 'D';
            }
            else{
                return 'F';
            }
        }
    }

