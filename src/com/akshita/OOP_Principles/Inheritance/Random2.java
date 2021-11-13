package com.akshita.OOP_Principles.Inheritance;

public class Random2 extends Random{

//    static void greeting(){
//        System.out.println("Hello");
//    }

    public static void main(String[] args) {
        Random obj=new Random2();
        obj.greeting();//it calls greeting method of Random class
        //because since method is static,so no matter via which object it is called ,as it can be caled without
        //object also(static method)
        //Since overriding depends on object and static is independent of object hence static method
        //can not be overridden.
        //Static can be inherited but cannot be overridden
    }
}
