import java.util.*;
class prog3
{
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		int a;
		a=in.nextInt();
		boolean flag=false;
		for(int i=2; i<(a/2); i++)
		{
			if( (a%i)==0 ) 
			{
				flag =true;
				break;
			}
		}
		if(flag==true) System.out.println("Not Prime");
		else System.out.println("Prime");

	}
}