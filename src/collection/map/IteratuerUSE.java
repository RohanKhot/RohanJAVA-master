package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratuerUSE
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> map=new HashMap<>();

        map.put(4,"rrk");
        map.put(5,"rk");
        map.put(6,"rohan");
        map.put(7,"khot");

        Set set=map.entrySet();
        Iterator i=set.iterator();
        while (i.hasNext())
            {
        Map.Entry t=(Map.Entry)i.next();
        System.out.println(t.getKey()+" "+t.getValue());
        }
        System.out.println();
    }
}
