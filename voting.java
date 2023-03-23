import java.io.*;
import java.util.*;
class voting{
	public static void main(String args[])
	{
		int age,v=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		age=sc.nextInt();
		if(age<=0)
		{
			System.out.println("enter valid input");
		}
		else if(age>=18)
		{
			System.out.println("eliglible to vote");
		}
		else
		{
			v=18-age;
			System.out.println("voter can eliglible to vote:"+v);
		}
	}
}
		