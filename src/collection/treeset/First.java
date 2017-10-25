package collection.treeset;

import java.util.TreeSet;

public class First {

    public static void main(String[] args) {


        TreeSet<String> k  = new TreeSet<>();

        k.add("df");
        k.add("d");
        k.add("r");
        k.add("w");
        k.add("t");
        k.add("df");

        for (String h:k
             ) {
            System.out.println(h);

        }
        /* reapted String are not accepted , output are sorted form */





    }
}

