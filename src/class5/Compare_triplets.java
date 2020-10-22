package class5;

import java.util.Scanner;

public class Compare_triplets {

	public static void main(String[] args) {
	Scanner q=new Scanner(System.in);
	System.out.println("enter your array length");
	int n=q.nextInt();
	int[] arr1=new int[n];
	int[] arr2=new int[n];
	int bob=0;
	//int res;
	int jack=0;
	System.out.print("enter your bob element here  ") ;
	for(int i=0; i<n; i++)
	{
		arr1[i]=q.nextInt();
	}
	System.out.print("enuter your jack elememt here  ");
	for(int i=0; i<n; i++)
	{
		arr2[i]=q.nextInt();
	}
	
	
	for(int i=0; i<arr1.length; i++)
	{
		for(int j=i; j<arr2.length; j++)
		{
			if(arr1[i]>arr2[j]) {
				
			bob++;	
			break;
		}
		else if(arr1[i]<arr2[j])
		{
			jack++;
			break;
		}
		
		else if(arr1[i]==arr2[j])
		{
			
		}
			break;
	}

	}
	System.out.println("bobs point = " + bob  + "jack point = " + jack);

}
}