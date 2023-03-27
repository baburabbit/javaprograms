import java.io.*;
import java.util.*;
class oddnum
{
	public static void main(String arg[])
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		i=sc.nextInt();
		for(j=1;j<i;j++)
		{
			if(j%2!=0)
			{
				System.out.println(j)
			}
		}
	}
}