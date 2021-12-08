package com.akshita.Comparison;

import com.akshita.Generics.Generics_List;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {


        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<5;i++){
            a.add(i+1);
        }
//        a.forEach((item)-> System.out.println(item*2));
//        Consumer<Integer> fun=(item)-> System.out.println(item*2);
//        int sum=(int a,int b)->a+b;
        Op sum=(a1,b)->a1+b;
        Op prod=(a1,b)->a1*b;
        Lambda p=new Lambda();
        System.out.println(p.oo(1,5,sum));
        System.out.println(p.oo(2,5,prod));
    }
    private int oo(int a,int b,Op x){
        return x.o(a,b);
    }

}
interface Op{
    int o(int a,int b);
}
