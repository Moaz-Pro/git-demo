package introtojava;
import java.util.Scanner; 

public class UserAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int x = 20;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter age: ");
		
		int age = input.nextInt();
		
		System.out.println("Your age is " + age);

	}

}
