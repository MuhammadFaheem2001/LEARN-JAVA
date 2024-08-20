package Practice;

public class Calculator {

	int square = 2;
	int cube  = 3;
	
	Calculator(){
		
		System.out.println("Non-parameterized Constructor");
	}
	
	Calculator(double square, double cube){
		
		System.out.println("Parameterized Constructor");
	}
	
	
	public double Square(double sqr) {
		
		
		return Math.sqrt(sqr);
		
	}
	
	public double Cube(double cube) {
		
		return cube * cube * cube;
	
	}

	public void Factorial() {
	
		int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
           factorial = factorial * i;
            
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
	
	

	public void Table() {
	int i,j;
	for(i=1; i<=10; i++) {
	for(j=1; j<=10; j++) {
		
		System.out.println(i + " X " + j + " = "  + i*j);
	}	
		System.out.println();
	}
	
	}
	
}
