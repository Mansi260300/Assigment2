//Q5 Create a class called 'Employee' with an ID, name and salary. The method increase Salary(percent) increases the salary by the given percentage.Write the Employee class

public class Employee1 {
	  
	   
	  private int id;
	    private String name;
	    private double salary;

	    public void Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void increaseSalary(double percent) {
	        if (percent < 10) {
	            throw new IllegalArgumentException("Percentage cannot be negative");
	        }
	        double increaseAmount = salary * (percent / 100.0);
	        salary += increaseAmount;
	    }

	    public static void main(String[] args) {
	        // Create an instance of the Employee class
	        Employee employee = new Employee(101, "Mansi Sonawane", 50000.0);

	        // Print initial employee details
	        System.out.println("Employee ID: " + employee.getId());
	        System.out.println("Employee Name: " + employee.getName());
	        System.out.println("Employee Salary: $" + employee.getSalary());

	        // Increase the salary by 10%
	        employee.increaseSalary(10.0);

	        // Print updated employee details
	        System.out.println("\nAfter Salary Increase:");
	        System.out.println("Employee ID: " + employee.getId());
	        System.out.println("Employee Name: " + employee.getName());
	        System.out.println("Updated Salary: $" + employee.getSalary());
	    }
	}