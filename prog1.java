class prog1
{
	public static void main(String args[])
	{
		double tmin= ((1.496e11 / 3e8)/60);
		System.out.println("Time taken my light(in min)= "+ tmin);
		double l= 12.5;
		double w=6.8;
		double area= l*w;
		double perimeter= 2*(l+w);
		System.out.println("Area(m2)= "+ area + " Perimeter(m)= "+ perimeter);
		double x=3.4;
		double fx= 4*Math.pow(x,3) - 3*Math.pow(x,2) + 18;
		System.out.println("fx= "+ fx);
	}
}