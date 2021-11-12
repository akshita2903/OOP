package com.akshita.OOP_Principles.Inheritance.Multiple;

import org.w3c.dom.ls.LSOutput;

//when one class inherits >1 parents
//A  B
//  C  => C is extending both A and B class
//class A{
//    int n;
//    A(){
//        this.n=10;
//    }
//}
//class B{
//    int n;
//    B(){
//        this.n=5;
//    }
//}
//class C extends B (A){
//    C(){
//
//        }
//        }
public class Main {

public static void main(String[] args) {
    //    C obj=new C();
//    c.n //?
    //since C inherits class A and B and both classes has a variable whose name is n,so when u ask C to print
    //C.n,it will get confused which n to choose ,hence multiple inheritance not supported in java
    System.out.println("JAVA DOES NOT SUPPORT MULTIPLE INHERITANCE :)");
    System.out.println("INTERFACE COMES INTO ACTION @");
}
}
//5-Hybrid Inheritance=>Single+Multiple Inheritance,In Java We don't have multiple inheritance ,so since
//hybrid inheritance involves multiple inheritance,so we don't have hybrid inheritance also.

