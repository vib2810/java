import java.util.*;
class prog2
{
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		double u,a, t;
		System.out.println("Enter the u");
		u=in.nextFloat();
		System.out.println("Enter the acceleration");
		a=in.nextFloat();
		System.out.println("Enter the time");
		t=in.nextFloat();
		double d= u*t + 0.5*a*Math.pow(t,2);
		System.out.println("Distance is: "+ d);
	}
}