package com.hezi.test;

public class demo implements Cloneable {
    private String name;
    private int age;
	public demo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		 demo obj=(demo)super.clone();
          obj.setName(obj.getName());;
		return obj;
	}
	public static void main(String[] args) throws Exception{
		new test().test1();
	}
}
class test{
	public  void test1() throws Exception {
           demo d=new demo("ÕÅÈý",28);
           demo d1=(demo)d.clone();
//           System.out.println(d);
//           System.out.println(d1);
             Boolean str=d.getName()==d1.getName();
	   System.out.println(str);
	   System.out.println(d1==d);
	}
}