package com.akshita.OOP_Principles.Inheritance.Multilevel;

public class BoxWeight extends Box {
   int w;
   BoxWeight(){
       super();
       this.w=0;
   }
   BoxWeight(int side,int w){
       super(side);//calls constructor of par class(box) that ha s1 parametr
       this.w=w;
   }
   BoxWeight(int l,int b,int h,int w){
       super(l,b,h); //calls constructor of parent class(Box int this case) that has 3 parametrs
       this.w=w;
   }
   BoxWeight(BoxWeight bw){
       super(bw);//simlira to Parentp=new Child(); calls constr of parnt class whose paremt is ibject
       this.w=bw.w;
   }
}
