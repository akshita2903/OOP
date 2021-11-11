package com.akshita.OOP_Principles.Inheritance;
//extends key word is used to inherit parent properties
public class Child extends Parent{
    char gender;
    Child(){
        //this.ears=
        super(); //super keyword to call parent constructor so that u can use it
        this.gender='F';
    }
    Child(int e,char eyes,String color,char gend){
        super(e,eyes,color); //this will call parent constructor to initialise parents properties
      //  this.ears//shows error
        this.gender=gend;
    }

    public static void main(String[] args) {
//        Child c=new Child();
//        System.out.println(c.color+" "+c.gender);
        Child c1=new Child(4,'B',"Black",'F');
        System.out.println(c1.eyes+" "+c1.color+" "+c1.gender);
    }
}
