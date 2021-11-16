package com.akshita;
//
//import com.akshita.AccessControl.AccessC;
//
//public class Public extends AccessC {
//    String x;
//    public Public() {
//        super();
//        this.x="Pro";
//    }
//
//    public static void main(String[] args) {
//        /*--------------------- PUBLIC ----------------------------
////        AccessC c=new AccessC();
////////        System.out.println(c.getNum());
//////        System.out.println("Before "+c.n);
//////        c.n=25;
//////        System.out.println("After "+c.n);
////        c.print();
//   ------------------------------------------------------- -----------------*/
//        //
//        //
//        /*--------------------PROTECTED---------------------------------------------------------*/
//    Public p=new Public();
////        System.out.println(p.num1); //unable to access as num1 is protected so we cannot access it outside package wihtourt subclass
//    //Now make this class as sbclass of AccessC
////        System.out.println("Before "+p.num1);
////        p.num1=20;
////        System.out.println("After "+p.num1);
////        p.printP();
//    }
//
//}
//-------------DEFAULT ------------------//
class Public{
    public static void main(String[] args) {
        System.out.println("Default");

    }
}
