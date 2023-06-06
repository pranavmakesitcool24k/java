import java.util.Scanner;
class AreaOfSquare
{
	public static void main(String []args)
	{
	int side,area;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of the sides of square");
	side=sc.nextInt();
	area=side*side;
	System.out.println("Area of square:"+area);
    }
}