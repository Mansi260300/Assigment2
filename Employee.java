//Q1 Create a class named 'Employee' with String variable 'name' and integer variable 'Id'. Create two objects with id and name Intialized and print these details.

public class Employee {
	 private String name;
	    private int id;
	    public Employee(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    public Employee(int i, String string, double d) {
			// TODO Auto-generated constructor stub
		}

		public String getName() {
	        return name;
	    }

	    public int getId() {
	        return id;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create two Employee objects with initialized values
        Employee employee1 = new Employee("Mansi Sonawane", 100);
        Employee employee2 = new Employee("Namrata Sonawane", 101);

        // Print the details of the first employee
        System.out.println("Employee 1 Details:");
        System.out.println("Name: " + employee1.getName());
        System.out.println("ID: " + employee1.getId());

        // Print the details of the second employee
        System.out.println("\nEmployee 2 Details:");
        System.out.println("Name: " + employee2.getName());
        System.out.println("ID: " + employee2.getId());
		

	}

	public String getSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	public void increaseSalary(double d) {
		// TODO Auto-generated method stub
		
	}

	

	}


