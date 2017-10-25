package collection.arrayList;

import java.util.ArrayList;

public class removeAll
{
    public static void main(String[] args) {
        ArrayList<String> kl=new ArrayList<>();

        kl.add("as");
        kl.add("as");
        kl.add("as");
        kl.add("as");
        kl.add("dd");
        kl.add("dd");
        kl.add("dd");
        kl.add("as");

        ArrayList<String>klp =new ArrayList<>();

        klp.add("dd");
        klp.add("dd");
        klp.add("dd");
        klp.add("dd");
        klp.add("dd");
        klp.add("dd");
        klp.add("dd");
        kl.add("as");


//        kl.addAll(klp);
//
//        kl.remove(3);
//        kl.remove(4);
//        kl.remove(2);

        kl.retainAll(klp);
        //kl.removeAll(klp);

        klp.retainAll(kl);
        for (String p:kl
             ) {
            System.out.println(p);
        }
        System.out.println("\n");

        for (String p1:klp
                ) {
            System.out.println(p1);
        }


    }

}
