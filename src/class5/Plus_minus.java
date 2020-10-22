package class5;

import java.util.Scanner;

public class Plus_minus {

	public static void main(String[] args) {
		Scanner A=new Scanner(System.in);
		System.out.println("enter your array length");
		int n=A.nextInt();
		int arr[]=new int[n];
		int  positive=0;
		int negative=0;
		int zero=0;
	
		System.err.println("enter your elments here");
		for(int i=0; i<n; i++)
		{
			arr[i]=A.nextInt();
			
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>0)
			{
				positive++;
		}
		else if(arr[i]<0)
		{
			negative++;
		}
		else if(arr[i]==0)
		{
			zero++;
		}
	}
		
		System.out.println("positive number =" + positive);
		System.out.println("negative number = " + negative);
		System.out.println("zero number = " + zero);
		double a=((double) positive)/n;
		double b=((double) negative)/n;
		double c=((double) zero)/n;
		System.out.println(String.format("%.6f",a));
		System.out.println(String.format("%.6f",b));
		System.out.println(String.format("%.6f",c));

}
}
