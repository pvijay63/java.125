package day3;

public class FloorAndCeil {

	public static void main(String[] args) {
		int []a= {2,4,6,9,1,5,6};
		int x=7;
		int floor=0,ceil=0;
		for (int i : a) {
			if(i<=x)
			{
				if(floor==0| i>floor)
					floor=i;
			}
			if(i>x)
			{
				if(ceil==0 | i<ceil)
					ceil=i;
			}
		}
		System.out.println("floor :"+floor);
		System.out.println("ceil :"+ceil);
	}
}
