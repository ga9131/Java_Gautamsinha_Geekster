package class5;

import java.util.Scanner;

public class Digonal_Diffrence {

	public static void main(String[] args) {
	
		Scanner hv=new Scanner(System.in);
		System.out.println("enter your array length");
		int n=hv.nextInt();
		int arr[][]=new int[n][n];
		int d1=0;
		int d2=0;
		int temp;
		System.out.println("enter your element");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				arr[i][j]=hv.nextInt();
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i==j)
				{
					d1=d1+arr[i][j];
				}
				if(i+j==n-1) {
					d2=d2+arr[i][j];
				}
			}
		}
temp=d1-d2;
System.out.println("Digonal difrence = " + temp);
	
	}
	

}
