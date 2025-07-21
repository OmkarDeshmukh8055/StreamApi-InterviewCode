package infinite;

import java.util.Scanner;

public class TekSystems1 {

	public static void main(String[] args) {
		int savedAmount=0;

Scanner sc=new Scanner(System.in);
		int startRange=sc.nextInt(), endRange=sc.nextInt();
		
			for(int i=startRange;i<=endRange;i++) {
			int temp=i,maxDigit=0,sum=0;		
			while(temp>0) {
				int v=temp%10;
				sum=sum+v;
				temp=temp/10;
				
				if(maxDigit<v) {
					maxDigit=v;
				}
				temp=(temp*10)/10;
			}
			int value=sum-maxDigit;
				if(value==maxDigit) {
				savedAmount=savedAmount+i;
			}	
		}
		System.out.println(savedAmount);
	}
}
