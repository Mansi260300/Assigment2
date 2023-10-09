//Q4 Write a program to print the area of rectangle by creating a class named 'Rectangle'having two methods.Constructor takes length and breadth rectangle as a parameter and the second method named as 'getArea' returns the area of rectangle.

public class Rectangle {
	  private double length;
	    private double breadth;

	    public Rectangle(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    public double getArea() {
	        return length * breadth;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Create an instance of the Rectangle class with length 5 and breadth 3
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Calculate and print the area of the rectangle
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);


	}

}


/*
Output: Area of the rectangle is: 15.0  */
