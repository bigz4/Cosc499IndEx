package code;

import java.util.Scanner;

public class arraySort {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Please enter 5 integers \n");
		
		//get integers from user
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter a integer \n");
			arr[i] = myObj.nextInt();
		}
		
		//insertion sort
		for(int i = 0; i < 5; i++) {
			int item = arr[i];
			int pos = i;
			while(pos > 0 && item < arr[pos-1]) {
				arr[pos] = arr[pos-1];
				pos--;
			}
			arr[pos] = item;
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}

}
