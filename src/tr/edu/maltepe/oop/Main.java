package tr.edu.maltepe.oop;
public class Main {

    public static void main(String[] args, int n) {

    }

        {
         int x;
        Student s1,s2;
        Javabooks ajavabook, anotherjavabook, javabook3;
        Library mylib ;


        mylib= new Library();

        ajavabook = new Javabooks(  "essential java", 500);
        anotherjavabook= new Javabooks("intro java programming",  300);
        javabook3=new Javabooks( "data structre", 400);


        mylib.add_book(ajavabook);
        mylib.add_book(anotherjavabook);


        mylib.List_books();


        s1=new Student();
        s1.readBook(ajavabook);


    }
      }



