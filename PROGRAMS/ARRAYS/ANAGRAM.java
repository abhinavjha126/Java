package ARRAYS;
import java.util.*;
class ANAGRAM 
{
	static String removeSpaces(String str) 
	{
		String str1=str.replaceAll(" ","");
		return str1;
	}
	static String toLowerCase(String str) 
	{
		char[] ch=str.toCharArray();
		String str1="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
				str1=str1+((char)ch[i]+32);
		        else
			str1=str1+ch[i];
		}
		return str1;
	}
	static String sort(String str) 
	{
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
			if(ch[i]>ch[j])
			{
				char t=ch[i];
			ch[i]=ch[j];
			ch[j]=t;
			}
			}
		}
		String st=new String(ch);
		return st;
	}
	static boolean compare(String s1,String s2) 
	{
		if(s1.length()!=s2.length())
			return false;
		else
		{
			s1=toLowerCase(s1);
			s2=toLowerCase(s2);
			s1=sort(s1);
			s2=sort(s2);
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			for(int i=0;i<ch2.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					return false;
				}
			}
		}
			return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST STRING");
		String s1=sc.nextLine();
		System.out.println("ENTER THE SECOND STRING");
		String s2=sc.nextLine();
		sc.close();
		s1=removeSpaces(s1);
		s2=removeSpaces(s2);
		boolean b=compare(s1,s2);
				if(b)
					System.out.println("STRING IS ANAGRAM");
				else
					System.out.println("STRING IS NOT ANAGRAM");
	}

}
