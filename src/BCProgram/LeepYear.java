package BCProgram;

import java.util.Scanner;

public class LeepYear {
	public static void main(String[]args) {
		int year;
		System.out.println("Enter the year:-");
		Scanner lp = new Scanner(System.in);
		year = lp.nextInt();
		if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0)) {
			
			System.out.println("The year is a leep year");
		}else {
			
			System.out.println("The year is not a leep year");
		}
	}
	

}
