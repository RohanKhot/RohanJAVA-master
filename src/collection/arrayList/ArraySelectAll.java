package collection.arrayList;

import java.util.ArrayList;

public class ArraySelectAll
{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("omkar");
        list.add("hrushikesh");
        list.add("rajkumar");
        list.add("rohan");



        ArrayList<String> list1=new ArrayList<>();

        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");

        ArrayList<String> list2=new ArrayList<>();

        list2.add("1_omkar");
        list2.add("2_hrushikesh");
        list2.add("3_rajkumar");
        list2.add("4_rohan");


        list1.addAll(2,list2);

        list1.add(3,"iffnjodk");

        for (String obj:list1)
        {
            System.out.println(obj);
        }
    }
}
