package www.program.hackerrank;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int counter,num,item,array[],first,middle,last;
		
		//To capture the input from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of item");
		
		num = sc.nextInt();
		//Create an array to store the numbers
		
		array = new int[num];
		//To enter the value in array
				
		System.out.println("Enter" + num + "integers");
		
		for (counter = 0; counter < num; counter++)
			array[counter] = sc.nextInt();
		
		System.out.println("Enter the number to be search");
		item = sc.nextInt();
		sc.close();
		first=0;
		last=num-1;
		middle=(first+last)/2;
		
		while(first <= last) {
			
			if (array[middle] < item)
				first = middle+1;
			else if (array[middle] == item)
			{
				System.out.println(item + "found at location" + (middle+1) + ".");
				break;
				
			}
			else
			{
				last = middle-1;
				
			}
			
			middle = (first + last)/2;
			
		}
		if(first > last)
		{
			System.out.println(item+ "is not found.\n");
		}
		
	}

}
