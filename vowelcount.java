import java.io.*;
import java.util.*;
class vowels
{
	public static void main(String[] args)
	{
		String s="worddocument";
		int vowel;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			vowel++;
		}
		System.out.println("vowels:"+vowel);
	}
}
