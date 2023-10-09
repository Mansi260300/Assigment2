//Q8.1 Demonstrate methods in string and stringbuilder classes.

public class StringMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating a String
        String str = "Hello, World!";
        
        // Length of the String
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Concatenation
        String newStr = str.concat(" How are you?");
        System.out.println("Concatenated String: " + newStr);
        
        // Substring
        String substring = str.substring(0, 5);
        System.out.println("Substring: " + substring);
        
        // Uppercase and lowercase
        String upperCaseStr = str.toUpperCase();
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Uppercase: " + upperCaseStr);
        System.out.println("Lowercase: " + lowerCaseStr);
        
        // Checking for presence
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
        
        // Replace
        String replacedStr = str.replace("World", "Universe");
        System.out.println("Replaced String: " + replacedStr);
        
        // Splitting into an array
        String[] words = str.split(", ");
        System.out.println("Split into words:");
        for (String word : words) {
            System.out.println(word);
        }
        
        // Checking for equality
        String anotherStr = "Hello, World!";
        boolean isEqual = str.equals(anotherStr);
        System.out.println("Strings are equal: " + isEqual);
        
        // Finding index of a character
        int indexOfComma = str.indexOf(",");
        System.out.println("Index of ',': " + indexOfComma);
    

	}

}

/*
Output: Length of the string:13
Concatenated String: Hello, World! How are you?
Substring: Hello
Uppercase: HELLO, WORLD!
Lowercase: hello, world!
Contains 'World': true
Replaced String: Hello, Universe!
Split into words:
Hello
World!
Strings are equal: true
Index of ',': 5   */
