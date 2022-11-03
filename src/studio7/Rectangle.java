package studio7;

public class Rectangle {
	private int length;
	private int width;
	private int area;
	private int perimeter;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
		
		if(length < 0 || width < 0) {
			System.out.print("invalid");
		}
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	// this point instance variable
	
	public int area() {
		return length * width;
	} 
	
	public int perimeter() {
		return (2*length)+(2*width);
	}
	
	public static String compare(int area1, int area2) {
		if(area1 > area2) {
			return "rectangle 1 larger";
		}
		else if(area1 == area2) {
			return "same";
		}
		else {
			return "rectangle 2 larger";
		}
	}
	
	//override
	public String toString() {
		return "length: " + length + " " +"width: " + width; 
		
	}
	
	
//	public void draw() {
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle(5,10);
		Rectangle r2 = new Rectangle(3,6);
		
		int areaA = r1.area();
		int areaB = r2.area();
		int c1 = r1.perimeter();
		int c2 = r2.perimeter();
		compare(areaA, areaB);
		System.out.println("r1: " + r1.toString());
		System.out.println("r2: " + r2.toString());
		System.out.println("r1 area: " + areaA);
		System.out.println("r2 area: " + areaB);
		System.out.println("r1 perimeter: " + c1);
		System.out.println("r2 perimeter: " + c2);
		System.out.println(compare(areaA, areaB));

	}

}
