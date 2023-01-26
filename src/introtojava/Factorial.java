package introtojava;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5;

        int x = 1;
        int number = input;
        while(input>=1) {
            x = x * input;
            input--;

        }
        System.out.println("Factorial of " + number + " is: " + x);
 
	}

}
