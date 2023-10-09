//Q2 Create a class which contains 2 static methods for finding the sum and difference of 2 numbers. 

public class Calculator {
	// Static method to calculate the sum of two numbers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Static method to calculate the difference of two numbers
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1 = 20;
	        int num2 = 10;

	        // Calculate and display the sum
	        int sum = Calculator.add(num1, num2);
	        System.out.println("Sum: " + sum);

	        // Calculate and display the difference
	        int difference = Calculator.subtract(num1, num2);
	        System.out.println("Difference: " + difference);

	}

	public int calculateSum() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int calculateDifference1() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int calculateDifference() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}

/*
Output: Sum: 30
        Difference:10	 */


	


