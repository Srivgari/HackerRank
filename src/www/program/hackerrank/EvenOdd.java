package www.program.hackerrank;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		sc.close();
		
		if (num%2==0) 
			
			System.out.println("Number is even");
		
		else 
			System.out.println("Number is odd");
	
	}

}
