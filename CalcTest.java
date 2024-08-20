package Practice;

public class CalcTest {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
	
		System.out.println("The Square is: " + calc.Square(3.0));
		System.out.println("The Cube is: " + calc.Cube(2.0));
		calc.Factorial();
		calc.Table();

	}

}
