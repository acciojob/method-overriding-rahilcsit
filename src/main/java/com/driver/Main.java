package com.driver;

public class Main {
    static class A {
        String meth() {
            return "Invoking method from class A";
        }
    }
   static class B extends  A {

       @Override
       String meth() {
           return "Method is overridden in Extendend class B";
       }
   }
    public static void main(String[] args) {
        B b1=new B ();
//        b1.meth();
//        System.out.println(b1.meth());
        b1.meth();
        System.out.println(b1.meth());
    }

}
