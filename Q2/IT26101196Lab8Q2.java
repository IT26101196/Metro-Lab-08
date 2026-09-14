import java.util.Scanner;

public class IT26101196Lab8Q2 {

public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		
		int[] A = {10, 20, 30, 40, 50};
		
		int[] B = {34, 67, 12, 89, 12};
		
		int[] C = new int[5];
		
		//Add A and B and store in C
		for (int i = 0 ; i < 5 ; i++){
			C[i] = A[i] + B[i];
		}
		
		//Print C
		System.out.println("Array C:");
		
		for (int i = 0 ; i < 5; i++){
			System.out.println(C[i]);
		}
}
}

		