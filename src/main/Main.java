package main;

public class Main {

	public static void main(String[] args) {
		for (int i= 0; i<100; i++) {
			System.out.println("valore di fibonacci per "+i+" : "+fibonacci(i));

		}
	}
			public static int fibonacci(int n) {
				  if (n < 2)
				    return n;
				  else
				    return fibonacci(n-2) + fibonacci(n-1);

	}

}
