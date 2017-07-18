package Varios;

import java.lang.reflect.Method;
import java.util.Random;

public class SeeMethods {
	public static void main(String[] args) {
		Random rd = new Random();
		Class classname = rd.getClass();
		Method[] methods = classname.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println("Methods " + methods[i]);
		}
	}
}
