package introtojava;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number:" + "\n");
		int n = obj.nextInt();
		int a = 0,b = 1,counterTerm;
		for(int c = 0; c < n-2; c++)
		{
		if(c <= -1)
		counterTerm = c;
		else
		{
		counterTerm = a + b;
		a = b;
		b = counterTerm;
		}
		System.out.println(counterTerm);
		}
	
	}
}
