package ARRAYS;
import java.util.*;
public class Number_of_Characters
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		int count=0;
		sc.close();
		for(int i=0;i<ch.length;i++)
		{
           if(ch[i]>=65 && ch[i]<=90 || ch[i]>=97 && ch[i]<=122 || ch[i]>=48 && ch[i]<=57 && ch[i]!=32 && ch[i]!=',' && ch[i]!='.')
        	   count++;
		}
System.out.println("NUMBER OF CHARACTERS= "+count);
}
}
