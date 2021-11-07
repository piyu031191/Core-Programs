package basicProgram;

import java.util.Scanner;

public class Harmonic {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Harmonic N :- ");
		float  result = 0 ;
        int Nth_Number = input.nextInt();
        for(float i=1;i<=Nth_Number;i++) {
    		System.out.println("step  "+ i+" is  :- " + (1/i));
			result  = result + (1/i);
			System.out.println("Harmonic Value of "+i+"th is  :- " + result);
		}
		System.out.println("Harmonic Value of Nth is  :- " + result);
	}

}
