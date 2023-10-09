//Q3 Create a class which contains 2 instances variables a,b Write a instance method for finding the sum and difference of 2 variables.
public class CalculatorInstance {
	 private int a;
	    private int b;

	    public void Calculator(int a, int b) {
	        this.a = a;
	        this.b = b;
	    }

	    // Instance method to calculate the sum of a and b
	    public int calculateSum() {
	        return a + b;
	    }

	    // Instance method to calculate the difference of a and b
	    public int calculateDifference() {
	        return a - b;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Calculate and display the sum
        int sum = calculator.calculateSum();
        System.out.println("Sum: " + sum);

        // Calculate and display the difference
        int difference = calculator.calculateDifference();
        System.out.println("Difference: " + difference);
	}

}

/*
Output: Sum:0 
        Difference:0 */
