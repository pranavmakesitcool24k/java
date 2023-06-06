import java.util.Scanner;

class Calculator{
	
	public static void main(String args[])
	{
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Multiplication");
		System.out.println("Enter 3 for Substraction");
		System.out.println("Enter 4 for Division");
		Scanner odin=new Scanner(System.in);
		int s=odin.nextInt();


    	switch(s)
		{
		case 1:
		int add;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Two Number For Addition");
		int a=input.nextInt();
		int b=input.nextInt();
		add=a+b;
		System.out.println("Addition is "+add);
		break;

        case 2:
		float mul;
		Scanner iron = new Scanner(System.in);
		System.out.println("Enter Two Number For Multiplication");
		float c=iron.nextFloat();
		float d=iron.nextFloat();
		mul=c*d;
		System.out.println("Multiplication is "+mul);
		break;

        case 3:
		float sub;
		Scanner thor = new Scanner(System.in);
		System.out.println("Enter Two Number For Substraction");
		float e=thor.nextFloat();
		float f=thor.nextFloat();
		sub=e-f;
		System.out.println("Substraction is "+sub);
		break;

        case 4:
		float div;
		Scanner vision=new Scanner(System.in);
		System.out.println("Enter Two Number For Division");
		float g=vision.nextFloat();
		float h=vision.nextFloat();
		div=g/h;
		System.out.println("Division is "+div);
		break;

        default:
        System.out.println("Enter Correct Choice!");
        }
	}
}