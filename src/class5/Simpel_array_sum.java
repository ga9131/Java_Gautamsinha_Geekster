package class5;

import java.util.Scanner;

public class Simpel_array_sum {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		System.out.println("enter your array length");
		int n=b.nextInt();
		int arr[]=new int[n];		
		int sum=0;
		System.out.println("enter your element here");
		for(int i=0; i<n; i++)
		{
			arr[i]=b.nextInt();
		}
for(int i=0; i<arr.length; i++)
{
	sum=sum+arr[i];
}
System.out.println("sum of array = " + sum);

	}

}
