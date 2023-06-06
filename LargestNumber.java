class LargNum
{
	public static void main (String args[])
	{
      int a,b,c;
      a=Integer.parseInt("1");   
      b=Integer.parseInt("2"); 
      c=Integer.parseInt("3"); 
      
       if(a>b && a>c)
       {
       	System.out.println("Largest Number Is:"+a);
       }
       else if(b>c)
       {
       	System.out.println("Largest Number Is:"+b);
       }
       else
       {
       	System.out.println("Largest Number Is:"+c);
       }
	}
}