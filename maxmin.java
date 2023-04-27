import java.io.*;
import java.util.Arrays;
class maxmin
{
	public static void main(String args[])
	{
		int[] arr={14,16,87,36,25,89,34};
		int m,n,mthmax,nthmin,sum,diff;
		m=1;
		n=3;
		Arrays.sort(arr);
		mthmax=arr[arr.length-m];
		nthmin=arr[n-1];
		sum=mthmax+nthmin;
		diff=mthmax-nthmin;
		System.out.println("1st maximum number="+mthmax);
		System.out.println(n +"the minimum number="+nthmin);
		System.out.println("sum="+sum);
		System.out.println("difference="+diff);
	}
}