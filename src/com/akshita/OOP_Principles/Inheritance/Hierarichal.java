package com.akshita.OOP_Principles.Inheritance;
//one class inherited by >1 classes
class A{
    int n;
    static int a=10;
    A(){
        this.n=10;
    }
    A(int n,int a){
        this.n=n;
        A.a+=a;
    }
}
class B extends A{
    int z;
    B(){
        super();
        this.z=20;
    }
    B(int z,int a,int n){
        super(n,a);
        this.z=z;
    }
}
class C extends A{
    int c;
    C(){
        super();
        this.c=30;
    }
    C(int c,int n,int a){
        super(n,a);
        this.c=c;
    }
}
public class Hierarichal {
    public static void main(String[] args) {
//        B objb=new B();
//        System.out.println(objb.n+" "+objb.z);
//        C obc=new C();
//        System.out.println(obc.n +" "+obc.c);
        B b=new B(1000,5,5);
        C c=new C(2000,10,10);
        System.out.println(b.z+" "+b.a+" "+b.n);
    }
}
