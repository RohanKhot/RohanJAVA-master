package collection.arrayList;

import java.util.ArrayList;

public class Array2ForEach
{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("omkar");
        list.add("hrushikesh");
        list.add("rajkumar");
        list.add("rohan");
        list.add("rohan");
        list.add(3,"fffff");
        list.add("");
        list.add("jk");

        for (String obj:list) {
            if (obj!=null) {
                System.out.println(obj);
            }
        }
    }
    
}
