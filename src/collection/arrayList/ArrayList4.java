package collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList4
{
    public static void main(String[] args)
    {
        Student1 s1 = new Student1(1, "rajkumar", 22);
        Student1 s2 = new Student1(2, "raj", 23);
        Student1 s3 = new Student1(3, "kumar", 24);

        ArrayList<Student1> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator it = list.iterator();

        while (it.hasNext())
        {
            Student1 st = (Student1)it.next();
            System.out.println(st.roll_no + "  " + st.name + "  " + st.age);

        }
    }
}
class Student1
{
    int roll_no;
    String name;
    int age;

    Student1(int roll_no,String name,int age )
    {
        this.roll_no=roll_no;
        this.name=name;
        this.age=age;
    }
}

