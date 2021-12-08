package com.akshita.Comparison;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    int roll_no;
    float marks;


    public Student(int roll_no,float marks){
        this.roll_no=roll_no;
        this.marks=marks;
    }
    @Override
    public int compareTo(Student x){
        //int diff=(int)(this.marks-x.marks);
        return (int)(this.marks-x.marks);
    }
    public String toString(){
    return marks+" ";
    }

    public static void main(String[] args) {
//       Student a=new Student(10,95f);
//       Student b=new Student(52,98f);
////      if diff==0 both student have same marks
////                if diff<1 means x is bigger
////        if diff>1 x is smaller obj1.compareTo(ob2)=>obj1 is current object(this) and obj2 is x
//        //oR_-------------
////        diff<0-> current object(this one) is smaller
////                diff>0 ->current object(this one) is bigger than
//        System.out.println(a.compareTo(b));
        Student a=new Student(10,95f);
       Student b=new Student(52,98f);
       Student c=new Student(2,99f);
       Student d=new Student(5,100f);
       Student e=new Student(2,95f);
       Student[] list={a,b,c,d,e};
//        System.out.println(Arrays.toString(list));
//        Arrays.sort(list);
//        System.out.println(Arrays.toString(list));
        Arrays.sort(list,(o1,o2)->(int)(o1.roll_no-o2.roll_no)); //sort on basis of marks
        System.out.println(Arrays.toString(list));
    }
}
