//Q7Create class point with following instance variables and methods Instance variables: int x, y Constructors: public Point(), Point (int x, int y)  Methods: public void setX(int x), setY(int y), setXY(int x, int y)  Create 2 point objects and compare if the points are overlapping.

public class Point {
	 private int x;
	    private int y;

	    public Point() {
	        // Default constructor, initializes both x and y to 0
	        this(0, 0);
	    }

	    public Point(int x, int y) {
	        // Constructor with custom x and y values
	        this.x = x;
	        this.y = y;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }

	    public void setXY(int x, int y) {
	        // Set both x and y at once
	        this.x = x;
	        this.y = y;
	    }

	    public int getX() {
	        return x;
	    }

	    public int getY() {
	        return y;
	    }

	    public boolean isOverlapping(Point otherPoint) {
	        // Check if two points are overlapping
	        return this.x == otherPoint.x && this.y == otherPoint.y;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Create two Point objects
        Point point1 = new Point(2, 3);
        Point point2 = new Point(2, 3);

        // Check if the points are overlapping
        boolean overlapping = point1.isOverlapping(point2);

        // Display the result
        if (overlapping) {
            System.out.println("The points are overlapping.");
        } else {
            System.out.println("The points are not overlapping.");
        }

	}

}

/*
Output: The points are overlapping. */
