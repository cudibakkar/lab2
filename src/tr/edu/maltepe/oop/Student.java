package tr.edu.maltepe.oop;


public class Student extends Person{
    private int studentNumber;

    public Student(){

    }
    public Student(int studentNumber) {
        this.setStudentNumber(studentNumber);
    }


    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void borrow(){
        System.out.println(getName() + " " + getSurname() + " has learned the lesson");
    }
    public void readBook(){
        System.out.println("Student learns java using Javabooks");

       ;
    }
    public void readBook (Javabooks abook){

    }
    public void borrow1(String ajavabook) {
        System.out.println("student borrowed"+ajavabook+".");
    }
    public void borrow2(String Javabook3) {
        System.out.println("student borrowed"+Javabook3+".");
    }
    public void return1(String ajavabook) {
        System.out.println("student borrowed"+ajavabook+".");
    }
    public void return2(String Javabook3) {
        System.out.println("student borrowed"+Javabook3+".");
   }
}

