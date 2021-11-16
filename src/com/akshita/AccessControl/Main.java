package com.akshita.AccessControl;


public class Main {
    public static void main(String[] args) {
        AccessC a=new AccessC(10,"Akshita");
        //Private ->data member can be accessed only in that class and not in any other class
        //including it child class(even if child class is in same package);
        a.getNum();
        a.num=10;
//        public->accessible anywhere
//        Default-> accessible only in same packages
//protected-> same package and subclass with diff package
    }
}
