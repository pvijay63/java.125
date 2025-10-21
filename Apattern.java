package day5;

import java.util.Scanner;

public class Apattern {
	
	public static void aPAttern(int m,int n)
	{
		if(m!=n & m%2==1 & n%2==1)
		{
			System.out.println("The no of rows & columns are must be same and odd");
			return;
		}
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 | j==1|i==3)
					System.out.print("*"+" ");
				else if(j==n)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int r=5;
		int c=5;
		aPAttern(r, c);
	}

}
