//Q9 If string 1 = "Hello World" String 2= "java", check using string method, if W is present in first string. If present replace word beginning with W to string 2 Output should be " Hello Java"

public class ReplaceSubStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Input strings
        String string1 = "Hello World";
        String string2 = "Java";

        // Check if "W" is present in string1
        if (string1.contains("W")) {
            // Replace the word beginning with "W" with string2
            string1 = string1.replaceFirst("\\bW\\w*", string2);
        }

        // Output the modified string1
        System.out.println(string1);
	}

}

/*
Output: Hello Java   */
