package com.akshita.OOP_Principles.Inheritance;

public class Parent {
  //  private int ears;
    int ears;
    char eyes;
    String color;
    Parent(){

        super();


       this.ears=2;
        this.eyes='G';
        this.color="white";
    }
    Parent(int e,char eye,String color){
        this.ears=e;
        this.eyes=eye;
        this.color=color;
    }
    Parent(Parent old){
        this.ears=old.ears;
        this.color=old.color;
        this.eyes=old.eyes;

    }


}
