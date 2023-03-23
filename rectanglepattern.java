import java.io.*;
import java.util.*;
class rectangle
{
	public static void main(String args[])
	{
		int r,c,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows:");		
		r=sc.nextInt();
		System.out.println("enter the no of column:");
		c=sc.nextInt();
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

