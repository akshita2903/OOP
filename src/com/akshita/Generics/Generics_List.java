package com.akshita.Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
//https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects
public class Generics_List<T>{

    private Object []CustomAList;
    private static int DEFAULT_SIZE=5;
    private int size=0;
    Generics_List(){
        this.CustomAList =new Object[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull())
        {
            resize();
        }
        CustomAList[size++]=num;
    }
    //REMOVE ELEMENT FROM DEMO_LIST
    public Object remove(){
        Object removed=CustomAList[--size];
        return removed;
    }
    //COMPLETELY REMOVE ALL ELEMENTS FROM DEMO_LIST
    public void clear(){
        size=0;
        Object[] temp=new Object[0];
        CustomAList=temp;
    }
    //TO GET ELEMENT PRESENT AT SPECIFIC INDEX IN DEMO_LIST
    public Object get(int index){

        return CustomAList[index];
    }
    //RETURNS SIZE OF DEMO_LIST
    public int size(){
        return size;
    }
    //SET A VALUE AT PARTICULAR INDEX IN DEMO_LIST
    public void set(int index,Object value){
        CustomAList[index]=value;
    }
    //OWNER'S FUNCTION
    private void resize(){
        int n=2*CustomAList.length;
        Object[] temp=new Object[n];
        //copy Demo_List data into this temporary array
        for(int i=0;i<n/2;i++){
            temp[i]=CustomAList[i];
        }
        CustomAList=temp;
    }
    //OWNER'S FUNCTION CHECK IF DEMO_LIST IS FULL,TRUE SO INCREASE DEMO_LIST SIZE FROM RESIZE() ELSE NOT
    private boolean isFull(){
        return size==CustomAList.length;
    }
    public static void main(String[] args) {


//           WITHOUT GENERICS
//        ArrayList l=new ArrayList();
//        l.add(1); l.add("spring");
        //-----------------------------//
        //WITH GENERICS
//        ArrayList<Integer> l=new ArrayList<>();
//        l.add(1);
//        l.add("spring"); //shows error
        Generics_List<Integer> obj=new Generics_List<>();
//        obj.add("2");
        obj.add(1); obj.add(5);
        System.out.println(obj.get(0)+" "+obj.remove());
    }
}
