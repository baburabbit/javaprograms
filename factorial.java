import java.io.*;
import java.util.*;
class fact
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the factorial number:");
		n=sc.nextInt();
		try
		{
			if(n<=0)
			{
				System.out.println("invaid number");
			}
			else
			{
				int fact=1,i;
				for(i=1;i<=n;i++)
				{
					fact=fact*i;
				}
				System.out.println("factorial number "+n+"is:"+fact);
			}
		}
		catch(Exception e)
		{
			System.out.println("invalid input");
		}
	}
}
	

		