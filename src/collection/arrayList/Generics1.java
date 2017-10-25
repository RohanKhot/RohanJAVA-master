package collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics1
{
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();

        list.add("omkar");
        list.add("hrushikesh");
        list.add("rajkumar");
        list.add("rohan");
        list.add("rohan");

        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());}
    }
}
