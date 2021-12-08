package com.akshita.Generics;

public class WildCard<T extends Number> {
    private Object[] a;
    int DEFAULT;


    int size=0;
    WildCard(){
        this.DEFAULT=10;
        this.a=new Object[DEFAULT];
    }
    public void add(T x){
        if(isFull()){
            resize();
        }
        a[size++]=x;

    }
    public int size(){
        return size;
    }
    public void set(int index,T data){
        a[index]=data;
    }
    public Object remove(){
       return a[--size];
    }
    private boolean isFull(){
        return size==a.length;
    }
    private void resize(){
        Object[] b=new Object[2*a.length];
        for(int i=0;i<size;i++) b[i]=a[i];
        a=  b;
    }
    public T get(int indx){
        return (T)a[indx];
    }

    public static void main(String[] args) {
        //WildCard puts restrictions on type of object we can use
       // WildCard<String> obj=new WildCard<String>();
        WildCard<Integer> obj=new WildCard<>();
        obj.add(45); obj.add(23); obj.add(90);
        obj.add(22);
        System.out.println(obj.size()+" "+obj.get(0)+" "+obj.remove());


    }
}
