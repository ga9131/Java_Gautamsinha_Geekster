package class5;

public class Staircase {
	
	
	
	public static void main(String[] args) {
		int a=4;
	for(int i=a; i>=1; i--)
	{
		for(int j=1; j<=a; j++)
		{
			if(j<i)
			{
				System.out.print(" ");
			}
			else
				System.out.print("#");
		}
		System.out.println();
	}

	}

}
