package com.akshita;

public class Constructor {

    public static void main(String[] args) {
//	Box b1=new Box();
//        System.out.println(b1.l+" "+b1.b+" "+b1.h);
//        Box cube=new Box(1,2,3); //it shows error as there is no constructor with 3 parameters
//        Box cube=new Box(2);
//        System.out.println(cube.l+" "+cube.b+" "+cube.h);
        //constructor from another constructor
        Box cc=new Box();
        System.out.println(cc.l+" "+cc.b+" "+cc.h);
    }
}
class Box{
// final int l=3;
    int l;
    int b;
    int h;
    // Default constructor
    Box(){
        this(2,5,7);
    }
    //parameterized constructor with one parameter;
    Box(int side){
       // this.l=side;
        this.b=side;
        this.h=side;
    }
    //constructor from another constructor
    Box(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }


}
