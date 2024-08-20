package Practice;

import java.util.Scanner;

public class MathClass {

	double x,y,c,d,e,f,g,h,i,j;
	int a,b; 
	
	public void Math() {
		
	Scanner ask = new Scanner(System.in);	
	
	System.out.println("Enter the value of a: ");
	a = ask.nextInt();
	
	System.out.println("Enter the value of b: ");
	b = ask.nextInt();	
	
	x =	Math.sin(a);
	y =	Math.cos(a);
	c =	Math.tan(a);
	d =	Math.sinh(a);
	e =	Math.cosh(a);
	f =	Math.tanh(b);
	g =	Math.log(b);
	h =	Math.PI * b * b;
	i =	Math.abs(b);
	j =	Math.asin(b);
		
	System.out.println("a = " + x);
	System.out.println("b = " + y);
	System.out.println("c = " + c);
	System.out.println("d = " + d);
	System.out.println("e = " + e);
	System.out.println("f = " + f);
	System.out.println("g = " + g);
	System.out.println("h = " + h);
	System.out.println("i = " + i);
	System.out.println("j = " + j);
	}
	
}
