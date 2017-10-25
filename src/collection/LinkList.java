package collection;

import java.util.LinkedList;

public class LinkList
{

    public static void main(String[] args) {

        LinkedList list =new LinkedList();

        list.add("list");
        list.add("list1");
        list.add("list2");
        list.add("list3");
        list.add("list4");
        list.add(88);

        System.out.println("LinkArray list="+list.size());
        System.out.println("LinkList=="+list);

        list.addFirst(99);

        System.out.println("LinkArray list="+list.size());


        System.out.println("linkList Update="+list);







    }

}
