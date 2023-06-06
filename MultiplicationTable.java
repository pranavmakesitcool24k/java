import java.util.Scanner;
class MultiplicationTable
{
	public static void main(String []args)
	{

	System.out.println("multiplication table from 0 to 10");
  
    for(int i=1;i<=10;i++)
    {
    		for (int j=1;j<=10;j++) 
    		{
    		  int c=i*j;
              System.out.print(" \t"+c);
    		}
    		System.out.println("");
    }
}
}
