package day5;

import java.util.Scanner;

public class AbcdPattern {

	public static void abcdPattern(int m,int n)
	{
		if(m!=n)
		{
			System.out.println("Both rows & columns are same");
			return;
		}
		char c='A';
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}
	
	
	public static void javaPattern(int m,int n)
	{
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j%2==0)
					System.out.print("A"+" ");
				else if(j==1)
					System.out.print("J"+" ");
				else if(j==3)
					System.out.print("V"+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a rows");
		int n1=sc.nextInt();
		System.out.println("Enter a columns");
		int n2=sc.nextInt();
		abcdPattern(n1, n2);
		javaPattern(n1, n2);
	}
	
}
