package basicProgram;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
	
		Scanner oe= new Scanner(System.in);
		System.out.println("Enter the number:" );
		int number = oe.nextInt();
		if(number%2==0){
			
			System.out.println("The number is even");
			
		}else {
			
			System.out.println("The number is odd");
			
		}
		

	}

}
