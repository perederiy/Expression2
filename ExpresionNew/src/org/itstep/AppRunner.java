package org.itstep;

public class AppRunner {
	public static void main(String[] args) {
		Function function = new Function();
		int result = function.getFunction();
		if(result != 0) {
		System.out.println(result);
		}
	}
}
