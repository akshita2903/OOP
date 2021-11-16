package com.akshita;

public class ObjectDemo{
    int num;
    String name;
    public ObjectDemo(int num,String name)
    {
        this.num=num;
        this.name=name;
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    //number representation of object(unique)
    //basically u can use it to check for uniqueness of object
    public int hashCode(){
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(25,"Akshita");
      ObjectDemo obj2=new ObjectDemo(30,"A");
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
        if(obj.equals(obj2))
            System.out.println("Equals object");
        System.out.println("Apple");
        System.out.println(obj instanceof Object);
        System.out.println(obj.getClass());

    }
}
