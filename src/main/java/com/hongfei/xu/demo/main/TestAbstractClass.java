package com.hongfei.xu.demo.main;

public abstract class TestAbstractClass {
	
	public TestAbstractClass(){
		
	}
	
	public String test(){
		return "";
	}
	
	private String hello(){
		System.out.println("hello");
		return "hello";
	}
	
	public abstract String testabs();
	
	public static String teststatic(){
		System.out.println("test static method");
		return "teststatic";
	}
	
	public static void main(String[] args) {

	}

}
