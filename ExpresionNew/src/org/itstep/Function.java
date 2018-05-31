package org.itstep;

public class Function {

public int x = 12;
	
	public int getFunction() {
		int result = 0;
		if((x > 0) && (x < 12)) {
		Factorial factorial = new Factorial();
		result =(x + 2)*factorial.getFactorial(x);
		return result;
		}else {
			System.out.println("Incorrect number");
			return 0;
		}
		
	}
}
