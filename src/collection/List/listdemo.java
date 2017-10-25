package collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listdemo {

    Integer id;
    String name ,city;

    listdemo(Integer id,String name,String city){
        this.id=id;
        this.name=name;
        this.city=city;

    }
}

class listcreate{
    public static void main(String[] args) {

        listdemo l1= new listdemo(1,"rohan","pune");
        listdemo l2= new listdemo(2,"rk","pune");
        listdemo l3= new listdemo(3,"0mkar","pune");
        listdemo l4= new listdemo(4,"rushi","pune");
        listdemo l5= new listdemo(5,"raj","pune");
        listdemo l6= new listdemo(6,"vaibhav","pune");
        listdemo l7= new listdemo(7,"pp","pune");
        listdemo l8= new listdemo(8,"pushpak","pune");
        listdemo l9= new listdemo(9,"Abhi","pune");


        List<listdemo> tt=new LinkedList<>();
        tt.add(l1);
        tt.add(l2);
        tt.add(l3);
        tt.add(l4);

        List<listdemo> kk=new ArrayList<>();
        kk.add(l5);
        kk.add(l6);
        kk.add(l7);
        kk.add(l8);
        kk.add(l9);

        System.out.println("by linklist==");
        for (listdemo o:tt
             ) {
            System.out.println(o.id+"  "+o.name+"  "+o.city);

        }

        System.out.println("\n"+"by arraylist==");
        for (listdemo p:kk
             ) {
            System.out.println(p.id+"  "+p.name+"  "+p.city);

        }

    }
}