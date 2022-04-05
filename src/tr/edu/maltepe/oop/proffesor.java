package tr.edu.maltepe.oop;


public class proffesor extends Person{
    private int professorNumber;

    public proffesor(){

    }

    public proffesor(int professorNumber) {
        this.setProfessorNumber(professorNumber);
    }


    public int getProfessorNumber() {
        return professorNumber;
    }

    public void setProfessorNumber(int professorNumber) {
        this.professorNumber = professorNumber;
    }

    public void borrow(){
        System.out.println( getSurname() + " has teached the lesson.");
    }
 public void borrow2(String anotherjavabook) {
        System.out.println("proffesor borrowed"+anotherjavabook+".");
        }
    public void return2(String anotherjavabook) {
        System.out.println("proffesor borrowed"+anotherjavabook+".");

}
   }

