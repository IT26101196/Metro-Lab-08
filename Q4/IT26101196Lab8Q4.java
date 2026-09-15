import java.util.Scanner;

public class IT26101196Lab8Q4 {
	
	public static void main(String args []){
		
		Scanner input = new Scanner(System.in);
		
		//Make array
		int [] studentArray = new int[8];
		  
		//Enter student ID 
		for (int i = 0 ; i < 6 ; i++){
			System.out.print("Enter student ID number " +(i + 1) + ":");
			studentArray[i] = input.nextInt();
			
			//Error massage is negative number or zero is added 
			if(studentArray[i] <= 0){
				System.out.println("Invalid number");
				System.out.println();
				i--;
			}
		}
		
		//Enter student ID to search
		System.out.print("Enter student ID to search:");
		int studentID = input.nextInt();
		
		//Inizialize counter
		int counter = 0;
		
		//Search for student ID
		for (int i = 0 ; i < 6 ; i++){
			
			if (studentArray[i] == studentID) {
				counter++;
			}
		}
		
		if (counter > 0){
			System.out.println("Student is Available");
			System.out.println();
		}
		else {
			System.out.println("Student is Not Available");
			System.out.println();
		}
	}
}