package code;

import java.util.Scanner;

public class arraySort {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Please enter 5 integers \n");
		System.out.println("or would you like to use random numbers? Y or N? \n");

		String ans = myObj.nextLine();
		
		switch(ans) {
			case "Y":
				for(int i = 0; i < 5; i++) {
					arr[i] = (int) (Math.random() * 10000) ;
				}
				break;
			case "N":
				//get integers from user
				for(int i = 0; i < 5; i++) {
					System.out.println("Enter a integer \n");
					arr[i] = myObj.nextInt();
				}
				break;
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
		//comment more x2
		System.out.println("\n ");
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i] + " ");
		}
		
		//stats
		double sum = 0;
		for(int i = 0; i < 5; i++){
			sum = sum + arr[i];
		}

		System.out.println("--------------------------------");

		double mean = sum/5;
		int median = arr[2];
		double top = 0;
		for(int i = 0; i < 5; i++){
			top = top + Math.pow((arr[i]-mean),2);
		}
		double std = Math.sqrt(top/5);

		System.out.println("mean: " + mean);
		System.out.println("meadian: " + median);
		System.out.printf("standard deviation: %.2f",std);

	}

}
