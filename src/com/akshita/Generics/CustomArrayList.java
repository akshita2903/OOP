package com.akshita.Generics;

import java.util.ArrayList;

public class CustomArrayList {

    //since you don't want  anyone to directly change the array,but can change via methods
    private int[] Demo_list;
    private static int DEFAULT_SIZE=10;
    private int size=0; //act as index or how many elements are there in Demo_List
    //Arraylist=new ArrayList/creates object of arraylist class and initialise its size,similarly
//    if you write Demo_list=new DemoList(); //it will create object of Demo_list class and initialise it with Default size;
    //to be accessible any where
    public CustomArrayList(){
        this.Demo_list=new int[DEFAULT_SIZE];
    }
    //ADDS ELEMENT TO OUR DEMO_LIST
    public void add(int num){
        if(isFull())
        {
            resize();
        }
        Demo_list[size++]=num;
    }
    //REMOVE ELEMENT FROM DEMO_LIST
    public int remove(){
        int removed=Demo_list[--size];
        return removed;
    }
    //COMPLETELY REMOVE ALL ELEMENTS FROM DEMO_LIST
    public void clear(){
        size=0;
        int[] temp=new int[0];
        Demo_list=temp;
    }
    //TO GET ELEMENT PRESENT AT SPECIFIC INDEX IN DEMO_LIST
    public int get(int index){

        return Demo_list[index];
    }
    //RETURNS SIZE OF DEMO_LIST
    public int size(){
        return size;
    }
    //SET A VALUE AT PARTICULAR INDEX IN DEMO_LIST
    public void set(int index,int value){
        Demo_list[index]=value;
    }
    //OWNER'S FUNCTION
    private void resize(){
        int n=2*Demo_list.length;
        int[] temp=new int[n];
        //copy Demo_List data into this temporary array
        for(int i=0;i<n/2;i++){
            temp[i]=Demo_list[i];
        }
        Demo_list=temp;
    }
    //OWNER'S FUNCTION CHECK IF DEMO_LIST IS FULL,TRUE SO INCREASE DEMO_LIST SIZE FROM RESIZE() ELSE NOT
    private boolean isFull(){
        return size==Demo_list.length;
    }
    public static void main(String[] args) {

CustomArrayList list=new CustomArrayList();
for(int i=0;i<15;i++){
    list.add(i);
}
        System.out.println(list.size());
list.set(2,45);
for(int i=0;i<list.size();i++){
    System.out.print(list.get(i)+" ");
}
        System.out.println();
list.clear();
        System.out.println(list.size());



    }
}
