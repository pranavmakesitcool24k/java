import java.util.Scanner;
class Javaloop{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    int []a = new int [10];
    int add=0;
    System.out.println("Enter 10 numbers!");
    for(int i=0;i<=9;i++)
    {
    a[i]= sc.nextInt();
    }
    System.out.println("sorted values are ");
    
    
    for (int i = 0; i <9; i++)   
    {  
     for (int j = i + 1; j <9; j++)   
     {  
     int tmp = 0;  
      if (a[i] > a[j])   
       {  
        tmp = a[i];  
        a[i] = a[j];  
        a[j] = tmp;  
       }  
     }  
     
    System.out.println(a[i]);  
    }  
}

  }
