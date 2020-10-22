package class5;

import java.util.Scanner;

public class Min_Max_SUm {

	public static void main(String[] args) {
		Scanner hv=new Scanner(System.in);
		System.out.println("enter length of an array");
		int n=hv.nextInt();
		int arr[]=new int[n];
		int min=arr[0];
		int temp;
		int amin=0;
		int max=0;
		System.out.println("enter your element in array ");
		for(int i=0; i<n; i++)
		{
		arr[i]=hv.nextInt();	 
		}
   for(int i=0; i<n; i++)
   {
	   for(int j=i+1; j<n; j++)
	   {
		   if(arr[i]>arr[j])
		   {
			   temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
		   }
			   
	   }
   }
   
   System.out.println("sorted array");
   for(int i=0; i<n-1; i++)
   {
	   System.out.print(arr[i] + ",");
	   
   }
   System.out.println(arr[n-1]);
   
  for(int i=0; i<n-1; i++)
  {
	  amin=amin+arr[i];
  }
   System.out.println("minimum nuber = " + amin);
	for(int i=0; i<n; i++)
	{
		max=max+arr[i];
	}
	System.out.println("maximum number = " + max);
	}

}
