import java.io.*;
import java.util.*;
class prime
{
	public  static void main(String arg[])
	{
		int i,j,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("prime number:");
		i=sc.nextInt();
		System.out.println("enter the number:");
		j=sc.nextInt();
		System.out.println("m:");
		m=sc.nextInt();
		for(int k=i+1;k>1;k++)
		{
			int e=0;
			for(int n=2;n<=k;n++)
			{
				if(k%n==0)
				{
					e++;
				}
			}
			if(e==1)
			{
				System.out.println(k);
				m++;
			}
			if(m==j)
			{
				break;
			}	
		}
	}
}