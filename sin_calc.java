import java.util.*;
class sin_calc
{
	public static double fact(int a)
	{
		double ans=1;
		for(int i=1; i<=a; i++)
		{
			ans*= i;
		}
		return ans;
	}
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		float x;
		int n;
		System.out.println("Enter the number in degrees");
		x=in.nextFloat();
		x*=(3.1415/180.0);
		System.out.println("Enter loop count");
		n=in.nextInt();
		double ans=0;
		for(int i=0; i<n; i++)
		{
			System.out.println(2*i+1);
			double fact = sin_calc.fact(2*i+1);
			double pow= Math.pow(x,(2*i+1));
			System.out.println("sign: "+ Math.pow(-1,i)+ "fact: "+ fact + "pow: " + pow);
			ans+= Math.pow(-1,i)*((double)pow/(double)fact); 
		}
		System.out.println("sin("+x+")= "+ ans);
	}
}