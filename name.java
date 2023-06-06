//note: only Data type String always need new deeclaration ex:     Scanner s=new Scanner(System.in);



import java.util.Scanner;

class Stud{
	
	public static void main(String args[])
	{

	 System.out.println("Enter your name");
	 Scanner n=new Scanner(System.in);
	 String name=n.nextLine();
	 System.out.println("Your Name "+name);

	 System.out.println("Enter your roll no");
	 int rollno=n.nextInt();
	 System.out.println("Your Roll No "+rollno);

	 System.out.println("Enter your phone no");
	 int phone=n.nextInt();
	 System.out.println("Your Phone No "+phone);

       
     Scanner s=new Scanner(System.in);
	 System.out.println("Enter your college name");
	 String college=s.nextLine();
	 System.out.println("Your College Name "+college);


      
	}
}