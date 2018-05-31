package org.itstep;

public class Factorial {

	public int getFactorial(int x) {
		if (x > 0 && x < 13) {
			int result = 1;
			for (int i = 2; i <= x; i++) {
				result = result * i;
			}
			return result;
		} else {
			return 0;
		}
	}
}
