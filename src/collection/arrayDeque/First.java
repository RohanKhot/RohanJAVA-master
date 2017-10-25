package collection.arrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class First {
    public static void main(String[] args) {

        Deque<book> books=new ArrayDeque<>();

        book b1=new book(11,"kjhg","omi","5");
        book b2=new book(11,"kjhg","omi","5");
        book b3=new book(11,"kjhg","omi","5");
        book b4=new book(11,"kjhg","omi","5");


        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        for (book p:books
             ) {
            System.out.println(p.id+" "+p.quantity+" "+p.publisher+" "+p.name);
            
        }

    }
}

class book{

    int id;
    String name,publisher,quantity;

    book(int id,String name,String publisher,String quantity){
        this.id=id;
        this.name=name;
        this.publisher=publisher;
        this.quantity=quantity;
    }


}