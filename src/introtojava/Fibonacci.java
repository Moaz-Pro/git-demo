package introtojava;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 1;
		int counter = 0;
		while (counter <= 9) {
			System.out.println(a + " ");
		int c = a + b;
		a = b; 
		b = c;
		counter++;
	   }
		
	}

}
