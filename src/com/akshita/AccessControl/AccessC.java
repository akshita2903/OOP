package com.akshita.AccessControl;

 public class AccessC {
   int num;
    String name;
    int[]  arr;
    public int n;
    protected int num1;

    public AccessC() {
        this.num=20;
        this.name="public";
        this.arr=new int[1];
        this.n=11;
        this.num1=2;
    }

    public AccessC(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[20];
    }
    public void print(){
        System.out.println("hello");
    }
    protected void printP(){
        System.out.println("Protected");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
