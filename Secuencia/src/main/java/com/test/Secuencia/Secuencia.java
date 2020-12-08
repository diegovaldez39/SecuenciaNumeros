package com.test.Secuencia;

public class Secuencia {
	public static long fibonacci(long pos) {

		long fibo1, fibona, paso;

		fibo1 = 1;
		fibona = 1;
		paso = 0;

		for (long x = 1; x <= pos; x++) {
			paso = fibona;
			fibona = fibo1;
			fibo1 = fibo1 + paso;

		}

		return fibona;
	}
}
