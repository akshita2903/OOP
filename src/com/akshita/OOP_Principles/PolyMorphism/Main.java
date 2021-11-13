package com.akshita.OOP_Principles.PolyMorphism;
///compile time polymorphism hs been done in calling constructors in inheritance
public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle=new Circle();
        Square square=new Square();
      //  shape.area();
        //circle.area();
//        square.area();
        //RUNTIME POLYMORPHISM_____________________
//        (what-reference variable and which->object type)
        Shapes s=new Circle();//what can be accessed depends on type of reference variable
        // ** which method common to both parent and child will be given preferences depends on type of Object
        s.area1();
        //JAva know this(**) by Dynamic Method Dispatch(mechanism by which a call to an overridden method is resolved during runtime
        //rather than compile time.).
        //You cannot override method which is Final and hence which method to call(if method is final) is determined at compile time->Early BInding
    }
}
