//area of box   height x length x width
//area of circle   3.14 x radius x radius

class ParametrizeConstructor
{
 double h,l,w,b,c,r;


  ParametrizeConstructor(double h,double l,double w)
  {
  b=h*l*w;
  System.out.println("Area of box is "+b); 
  }
         

 ParametrizeConstructor(double r)
 {
  c=3.14*r*r;
  System.out.println("Area of circle is "+c);
 }
 
 
 public static void main(String args[])
 {
 	ParametrizeConstructor b1 = new ParametrizeConstructor(12.2,10.2,11.4);
 	ParametrizeConstructor c1 = new ParametrizeConstructor(3.0);
 }

}  
