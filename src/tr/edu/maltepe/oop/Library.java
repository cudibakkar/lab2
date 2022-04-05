package tr.edu.maltepe.oop;

import java.util.Vector;

public class Library {

    private Vector books;
    public Library (){
        books =new Vector();

    }


    public void add_book (Javabooks ajavabook){
        books.add(ajavabook);
    }

    void List_books() {
        System.out.println("\nname of the books");
        for ( int i = 0; 1<books. size();i++) {
            Javabooks temp=(Javabooks) books.get(i);
            System.out.println(temp.getbookname());
        }
    }
    void returnBook(Javabooks bb , Person p){
        p.removeBook(bb);
        books.add(bb);
    }
}

