package Practice;

public class Box {

	double width;
	double height;
	double depth;
	
	//public double volume() {
		
		//return width * height * depth;
		
	//}
	
	 Box(){
		System.out.println("Non Parameterized Constructors.......");
	width = 10;
	height = 15;
	depth = 16;
		
	
	}
	 
	 public double getvolume() {
		 
		 return width * height * depth;
	 }
}
