package com.akshita;
//this is outer class and it is self static(dont need to add static as it is independent of any other class
public class InnerClass {
   static class staticinner{ //this can be static or non static as it depneds on outer class
        staticinner(){
            System.out.println("Sttaic");
        }
    }
    class nonstatic{
       nonstatic(){
           System.out.println("Non static");
       }
    }

    public static void main(String[] args) {
     staticinner x=new staticinner();//it is independent of object of its class which is InnerClass
        InnerClass ic=new InnerClass();
     nonstatic ns=ic.new nonstatic();//it is dependent of object of its class InnerClass


    }
}
