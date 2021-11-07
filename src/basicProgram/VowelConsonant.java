package basicProgram;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner vc = new Scanner(System.in);
		System.out.println("Enter the alphabet:");
		char ch = vc.next().charAt(0);
	       if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o' || ch == 'u') {
	    	   System.out.println("Given alphabet is vowel");
	       }else {
	    	   System.out.println("Given alphabet is consonent");

	       }
		}

	}


