package infinite;

import java.util.Scanner;

public class TEKSystems {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[][]=new int[n][n];

	for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
	};
	for(int i=0;i<arr.length;i++) {
		
		for (int j = 0; j < arr.length; j++) {
			
			int temp=arr[i][j];
			for(int k=5;k<=50;k=k+5) {
				if(temp<=k) {
					System.out.print(k+" ");
					break;
				}
			}
		}
		System.out.println();
	}
	}
}
