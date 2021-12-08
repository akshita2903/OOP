package com.akshita.Cloning;

public class Human implements Cloneable{
    int age;
    String name;
int[] a;



    public Human(int age,String name){
        this.age=age;
        this.name=name;
        this.a=new int[]{1,2,3,4,5,6};
    }
//    public Human(Human New){
//        this.age=New.age;
//        this.name=New.name;
//    }
    public Object clone() throws CloneNotSupportedException{
//        //--SHALLOW COPY
//        return super.clone();
        //DEEP COPY
        Human x=(Human)super.clone(); //shallow
        //make a deep copy
        x.a=new int[x.a.length];
        for(int i=0;i<x.a.length;i++){
            x.a[i]=this.a[i];
        }
        return x;
    }
}
