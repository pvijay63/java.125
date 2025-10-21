package day5;

import java.util.Scanner;

public class HalosphereStar {

	public static void haloSphereStar(int m,int n)
	{
		if(m!=n)
		{
			System.out.println("Both rows & columns must be equal");
			return;
		}
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1|i==m|j==1|j==n)
				System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int r=sc.nextInt();
		System.out.println("Enter no of columns");
		int c=sc.nextInt();
		haloSphereStar(r, c);

}
}

