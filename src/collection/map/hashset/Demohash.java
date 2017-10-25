package collection.map.hashset;

import java.util.HashSet;

public class Demohash {

    public static void main(String[] args) {
        HashSet<String> list=new HashSet<>();
        list.add("omkar");
        list.add("hrushikesh");
        list.add("rajkumar");
        list.add("rohan");
        list.add("rohan");
        list.add("omkar1");
       // list.add("");
        list.add("jk");

        list.size();
        for (String obj:list) {
            if (obj!=null) {
                System.out.println(obj);
            }
        }
    }

}
