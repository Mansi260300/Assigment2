//Q8.2  Demonstrate methods in string and stringbuilder classes.

public class StringBuilderMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Creating a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        
        // Appending
        sb.append(", World!");
        System.out.println("Appended String: " + sb.toString());
        
        // Inserting
        sb.insert(5, " Java");
        System.out.println("Inserted String: " + sb.toString());
        
        // Deleting
        sb.delete(5, 9);
        System.out.println("Deleted String: " + sb.toString());
        
        // Reversing
        sb.reverse();
        System.out.println("Reversed String: " + sb.toString());
        
        // Length of the StringBuilder
        int length = sb.length();
        System.out.println("Length of the StringBuilder: " + length);
        
        // Setting a character at a specific position
        sb.setCharAt(0, 'h');
        System.out.println("Modified StringBuilder: " + sb.toString());
        
        // Converting to String
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
	}


	

}

/*
Output:Appended String: Hello,World!
       Inserted String: Hello, Java, World!
       Deleted String: Helloa, World!
       Reversed String: !dlrow ,aolleH
       Length of the StringBuilder: 14
       Modified StringBuilder: hdlrow ,aolleH
       Converted to String: hdlrow ,aolleh  */
