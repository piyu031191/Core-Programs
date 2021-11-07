package basicProgram;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
	         int no1,no2,no3,largest,temp;
	         Scanner input = new Scanner(System.in);     
	         System.out.println("Enter the first number:");  
	         no1 = input.nextInt();
	         System.out.println("Enter the second number:");  
		     no2 = input.nextInt();
		     System.out.println("Enter the third number:");  
		     no3 = input.nextInt();
		     temp = no1>no2?no1:no2;
		     largest = no3>temp?no3:temp;
		     System.out.println("The largest number is: " +largest);
		}


	}


