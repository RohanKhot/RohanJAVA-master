package collection.treeset;

import java.util.TreeSet;

public class Secound
{
    public static void main(String[] args) {
        TreeSet<Integer> i=new TreeSet<>();

        i.add(9);
        i.add(2);
        i.add(3);
        i.add(14);
        i.add(5);
        i.add(6);
        i.add(7);
        i.add(8);

        for (Integer o:i
             ) {
            System.out.println(o);


        }
        System.out.println("lastest no="+i.size());
        System.out.println("First no="+i.first());


    }}
