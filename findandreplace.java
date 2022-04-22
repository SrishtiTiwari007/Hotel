package p1;

import java.util.Scanner;

public class findandreplace {
	public static void main(String args[])
	{
	String s,n,m;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	s=sc.nextLine();
	System.out.println("Enter string to be replace");
	n=sc.next();
	System.out.println("Enter string to replace");
	m=sc.next();
	s=s.replace(n, m);
	System.out.println("Replaced string : "+s);
	sc.close();
	}
}


