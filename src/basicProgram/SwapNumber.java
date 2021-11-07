package basicProgram;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		int x,y,t;
	 Scanner sn = new Scanner(System.in);
	 System.out.println("Enter the values of x and y:-" );
	 x= sn.nextInt();
	 y= sn.nextInt();
	 System.out.println("Values before swapping:-" +x+ " , " +y );
	 t=x;
	 x=y;
	 y=t;
	 System.out.println("Values after swapping:-" +x+ " , " +y );
	 System.out.println();
	 

 
	}

}
