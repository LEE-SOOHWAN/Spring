package com.care.interface_test;

import java.util.ArrayList;

public class PrintClass {
	public void print(String name, ArrayList food) {
		System.out.println("이름 : "+name);
		System.out.println("food0 : "+food.get(0));
		System.out.println("food1 : "+food.get(1));
		System.out.println("food2 : "+food.get(2));
	}
}
