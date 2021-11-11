package com.akshita.OOP_Principles.Inheritance.Multilevel;

public class BoxPrice extends BoxWeight {
    int price;
BoxPrice(){
    super(); //calls cons of boxweight which casll const of box
    this.price=-5;
}
BoxPrice(int side,int weight,int p){
    super(side,weight);//class BoxWeight constr with two parametrs
    this.price=p;
}
BoxPrice(int len,int b,int h,int w,int p){
    super(len,b,h,w);
    this.price=p;
}
BoxPrice(BoxPrice bp){
    super(bp);//
    this.price=bp.price;
}



}
