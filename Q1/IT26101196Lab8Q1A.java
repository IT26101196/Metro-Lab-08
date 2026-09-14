import java.util.Scanner;

public class IT26101196Lab8Q1A {

public static void main(String [] args){

		
		Scanner input = new Scanner(System.in);
		
		//We create an array
		int[] myArray = new int[5];
		
		//Input 5 numbers 
		
		for (int i = 0 ; i < 5 ; i++){
			System.out.print("Enter number " +(i + 1) + ":");
			myArray[i] = input.nextInt();
		}
		
		//Print numbers in reverse order
		
		for (int i = 4 ; i >= 0 ; i--){
			System.out.println(myArray[i]);
		}
	}
}

			
		
		