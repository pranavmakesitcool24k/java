import java.util.Scanner;
class AreaOfRectangle
{
	public static void main(String []args)
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Length of Rectangle");
	double length =scanner.nextDouble();
	System.out.println("Enter the Width of Rectangle");
	double width=scanner.nextDouble();
	double area=length*width;
	System.out.println("Area of reactangle is:"+area);
	}
}