package com.akshita.OOP_Principles.Inheritance.Multilevel;

public class Box {
    int len,br,h;
    Box(){
        this.len=-1;
        this.br=-1;
        this.h=-1;
    }
    Box(int side){
        this.len=side;
        this.br=side;
        this.h=side;
    }
    Box(int l,int b,int h){
        this.len=l;
        this.br=b;
        this.h=h;
    }
    Box(Box b1){
        this.len=b1.len;
        this.br=b1.br;
        this.h=b1.h;
    }
}
