package Practice;

public class equation {

	public static void main(String[] args) {
		int x=2;
		
		
		
		double res = 3 * Math.pow(x, 4) * Math.sin(180*x) + 4 * Math.pow(x, 3) * Math.cos(90*x) + Math.pow(x, 2) * Math.sin(Math.tan(45)) + 7 * x + 9 * Math.cos(90 * Math.pow(x, 2)) ;

		System.out.println("The Equation's Output Are: "  + res);
	}

}
