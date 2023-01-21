package Equation;
import java.util.*;
import java.math.*;
public class Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double r1,r2;
Scanner sc =new  Scanner(System.in);
System.out.println ("enter the value A B C");

double a = sc.nextDouble();
double b = sc.nextDouble();
double c = sc.nextDouble();

double d=b*b-4.0*a*c;
if (d>0.0)
{
	r1=r2=(-b+Math.sqrt(d))/(2.0*a);
	System.out.println("The roots are  r1= "+r1+"  r2= "+r2);
	
	}
else if (d==0.0)
{
 r1=-b/(2.0*a);
 System.out.println("The roots are r1"+r1);
 
}
else
{System.out.println("no roots");

	
	}
	}

}
