import java.util.Scanner;

public class IT26101196Lab8Q1B {

public static void main(String [] args){

		
		Scanner input = new Scanner(System.in);
		
		//Create my array
		int[] myArray = new int[5];
		
		//Input 5 numbers 
		for (int i = 0 ; i < 5 ; i++){
			System.out.print("Enter number " +(i + 1) + ":");
			myArray[i] = input.nextInt();
			
		}
	
		//Create even array (there could be maximum of 5 values) 
		int[] evenArray = new int[5];
		int evenCount = 0;
		
		//Find even numbers 
		for (int i = 0 ; i < 5 ; i++){
		if (myArray[i] % 2 == 0) {
			
			evenArray[evenCount] = myArray[i];
			evenCount++;
		}
		}
		//Print even numbers 
		System.out.println("Print even numbers");
		for (int i = 0 ; i < evenCount ; i++){
			System.out.println(evenArray[i]);
		}
		
		
	}
}