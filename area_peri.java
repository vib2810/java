import java.util.*;
class area_peri
{
	public static void main(String args[])
	{
		float l,w;
		System.out.println("Enter the length and width: ");
		l=Float.valueOf(args[0]).floatValue();
		w=Float.valueOf(args[1]).floatValue();
		System.out.println("Area= " + (l*w) + " Perimeter= " + 2*(l+w));	
	}
};