package com.test.automation.GetEnevironmentVariables;

public class Test {

	@org.junit.Test
	public void test() {
		System.out.println("I am test");
		System.out.println("varaiable: "+System.getProperty("browser"));
	}
	
}
