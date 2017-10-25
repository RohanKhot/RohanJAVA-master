package collection.arrayList;

import java.util.ArrayList;

public class ArrayList3
{
    public static void main(String[] args) {
        Student s1=new Student(1,"rajkumar",22);
        Student s2=new Student(2,"raj",23);
        Student s3=new Student(3,"kumar",24);

        ArrayList<Student> list=new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (Student obj:list) {
            System.out.println(list);
        }
    }
}

class Student{
    int roll_no;
    String name;
    int age;

    Student(int roll_no,String name,int age ){
        this.roll_no=roll_no;
        this.name=name;
        this.age=age;
    }
}