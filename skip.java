import java.io.*;
import java.util.*;
class skip
{
	public static void main(String args[])
	{
		int m,n,k,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the M value:");
		m=sc.nextInt();
		System.out.println("enter the N value:");
		n=sc.nextInt();		
		System.out.println("enter the k value:");
		k=sc.nextInt();
		k++;
		for (i=m; i<=n;i=i+k)
		{
			System.out.println(i);
		}
	}
}