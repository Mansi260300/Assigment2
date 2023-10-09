//Q6 Write a program to demonstrate static variables

public class StaticVariablesDemo {
	 // Static variable shared among all instances of the class
    static int staticVar = 0;

    // Instance variable unique to each instance of the class
    int instanceVar;

    public StaticVariablesDemo(int instanceVar) {
        this.instanceVar = instanceVar;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create two instances of the class
        StaticVariablesDemo obj1 = new StaticVariablesDemo(10);
        StaticVariablesDemo obj2 = new StaticVariablesDemo(20);

        // Access and modify the static variable using both instances
        obj1.staticVar = 5; // Changes the static variable for all instances
        obj2.staticVar = 15;

        // Print static and instance variables for both objects
        System.out.println("Object 1 - Static Variable: " + obj1.staticVar + ", Instance Variable: " + obj1.instanceVar);
        System.out.println("Object 2 - Static Variable: " + obj2.staticVar + ", Instance Variable: " + obj2.instanceVar);
		
	}

}


/*
Output: Object 1 - Static Variables: 15,Instance Variable:10
        Object 2 - Static Variables: 15,Instance Variable:20  */
