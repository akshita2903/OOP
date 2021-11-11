package com.akshita;
//it work auto matically in java
public class GarbageCollection {
    public static void main(String[] args) {
        GC g;
      for(int i=0;i<=100000000;i++)
        {
            g=new GC(); // object are created evry second
        }
    }

}
class GC{
    int data;
    GC(){
        this.data=-1;
        System.out.println("Object Created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}

