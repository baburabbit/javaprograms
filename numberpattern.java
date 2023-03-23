import java.io.*;
import java.util.*;
class number
{
	public static void main(String args[])
	{
		int r,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows:");		
		r=sc.nextInt();
		for(i=1;i<r;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.print("\n");
		}
	}
}

