import java.util.Scanner;

public class IT26101196Lab8Q3 {

    public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		
		//Create array
		int[] myArray = new int[6];
		
		//Input 6 numbers
		for (int i = 0 ; i < 6 ; i++){
			System.out.print("Enter positive number " +(i + 1) + ":");
			myArray[i] = input.nextInt();
			
			if(myArray[i] <= 0){
				System.out.println("Invalid number");
				System.out.println();
				i--;
			}
		}
		
		//Print contents of array
		System.out.print("myArray contents:");
		for (int i = 0 ; i < 6 ; i++){
			System.out.println(myArray[i]);
		}
		//Finding maximum 
		int max = myArray[0];//initialize the 0th element as max, while going through array compare with other elements to figure out max
		for(int i = 1; i < 6; i++){
			if(myArray[i] > max){
				max = myArray[i];
			}
		}
		
		//Print maximum 
		System.out.println("Maximum value:" +max);
		System.out.println();
	}
}
		

