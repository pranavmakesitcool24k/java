import java.util.Scanner;
class greaterNo
{

	public static void main(String args[])
	{
     int a,b,c; 
     Scanner input = new Scanner(System.in);
     System.out.println("Enter three numbers");
     a=input.nextInt();
     b=input.nextInt();
     c=input.nextInt();


     int d=(a>b)?(a>c)?a:(c>b)?c:b:b;
     System.out.println(d+ " is greater");


    /* if(a>b && a>c)
     {
        System.out.println("a is greater no "+a);
     }
     else
     {
        if (b>c && b>a)
        {
            System.out.println("b is greater no "+b);
        }
        else
        {
          System.out.println("c is greater no "+c);
        }

	  }*/


    }
}