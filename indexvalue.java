import java.io.*;
import java.util.*;
class string
{
   	public static void main(String []args) {
      		String str = "I am a programmer";
      		Scanner s= new Scanner(System.in);
      		System.out.println("enter the string:");
      		String a= s.nextLine();
      		int index = str.indexOf( "p" );
      		System.out.printf( "p is at index of"+(index+1));
	}
}