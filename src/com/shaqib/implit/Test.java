package com.shaqib.implit;

import com.shaqib.it.it3;

public class Test implements it3 {
	public void m1()
	{
	System.out.println("m1 method");
	System.out.println(a);//a is final variable hence it replaced at compilation time only
	}
	public static void main(String[] args)
	{
	Test t = new Test();
	t.m1();
	}
}
