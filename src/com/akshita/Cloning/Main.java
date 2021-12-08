package com.akshita.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {




//        Human ak=new Human(10,"Akshita");
////        Human b=new Human(ak); //this takes lot of time for cloning
//     Human twin=(Human)ak.clone();
////        System.out.println(twin.name+" "+twin.age);
////        System.out.println(Arrays.toString(twin.a));
//        twin.a[0]=100;
       // System.out.println(Arrays.toString(twin.a));
//        //shallow copy for primitive
//       // System.out.println(Arrays.toString(ak.a));
//        twin.age=20;
//        //for non primitive
//        System.out.println(twin.age+" "+ak.age);
        //---------DEEP COPY-----------------
        Human ab=new Human(5,"ab");
           Human twin=(Human)ab.clone();
           twin.a[0]=25;
        System.out.println(Arrays.toString(twin.a));
        System.out.println(Arrays.toString(ab.a));
    }
}
