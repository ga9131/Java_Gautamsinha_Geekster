package class5;

import java.util.Scanner;

public class Solve_me_first {
	
	static int addTwoNumber(int a, int b) {
		int sum;
		sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		Scanner q=new Scanner(System.in);
		System.out.println("enter your first number");
		int a=q.nextInt();
		System.out.println("enter your second nummber");
		int b=q.nextInt();
		int sum;
		sum= addTwoNumber(a,b);
		System.out.println("sum of the number = " +sum);
	
	}

}
