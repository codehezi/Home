package com.hezi.test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class demo3 {
  public static void main(String[] args) {
	  test1();
}
  public static void test() {
	  Integer i=new Integer(2);
	  int i1=2;
	  Integer i3=2;
	  System.out.println(i==i1);//true
	  System.out.println(i1==i3);//true
	  System.out.println(i==i3);//false	  
  }
  public static void test1() {
          Integer a=127;
          Integer b=127;
          Integer c=128;
          Integer d=128;
          System.out.println(a==b);//true
          System.out.println(c==d);//false         
    }
}
