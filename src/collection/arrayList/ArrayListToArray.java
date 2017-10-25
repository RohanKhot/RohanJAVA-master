package collection.arrayList;

import java.util.ArrayList;

public class ArrayListToArray
{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(2);
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(26);

        for (Integer k:list
             ) {
            System.out.println("given number="+k);
        }
            Object[ ] array=list.toArray();
        System.out.println();
        for (Object l:array
             ) {
            System.out.println("Array list="+l);

        }

    }
}
