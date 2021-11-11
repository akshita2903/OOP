package com.akshita.OOP_Principles.Inheritance;

public class Main {
    public static void main(String[] args) {




        Parent p=new Child(3,'B',"White",'F');
        //types of referenve variable determines what variables u can access
        //System.out.println(p.eyes); //=>shows error
        //----------------------------------//
        //although above point states that types of ref var determines what variales u an access but here if object
        // is of parent class then how the child class can call constructor
        // of itself as parent class dont know anything about child class
//        Child c1=new Parent(3,'G',"Black"); => shows error

    }
}
