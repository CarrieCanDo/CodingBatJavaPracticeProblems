package org.example;

public class Strings {

    /*
    Method - is a block of code that performs a specific task and can be called (invoked)
    whenever that task needs to be performed.
    public - access modifier, can be accessed from other classes.
    return type - String, specifies the type of value the method returns.
    Method name - helloName, the name of the method, used to call the method from other parts of the code.
    Parameters - Data Type is String, specifies the parameter `name` should be a string.
                 - Parameter name - name of the parameter that will be used within the method.
    Method body - the block of code that defines what the method does
                  {is enclosed in curly braces}.
    Return stmt - specifies what is being returned. */
    /*
    The method helloName takes a string parameter name and returns a greeting message that combines
    the string "Hello " with the value of name and an exclamation mark.
    */
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    /*
    The method makeAbba takes two string parameters a and b and returns a new string
    formed by concatenating a, b, b, and a in that order.
    */
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    /*
    The method makeTags takes a tag and a word as input and returns the word wrapped in HTML tags
    corresponding to the provided tag.
    */
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }


    /*
    The method makeOutWord inserts a given word into the middle of an "out" string and
    returns the result.
    */
    public String makeOutWord(String out, String word) {
        String start = out.substring(0, out.length() / 2);
        String end = out.substring(out.length() / 2);
        return start + word + end;
    }


    /*
    The method extraEnd returns a new string consisting of three copies of the last two characters of the
    input string.
    */
    public String extraEnd(String str) {
        String lastTwoChars = str.substring(str.length() - 2);
        return lastTwoChars + lastTwoChars + lastTwoChars;
    }



/* given a string of even length, return the first half so the string WooHoo yields Woo */
    public String firstHalf(String str) {
        int length = str.length();/*get the length of the string*/
        int halfLength = length/2;/*calculate the midpoint*/
        return str.substring(0, halfLength);/*return the first half of the string*/
    }


    /*Given a string, return a version without the first and last char, so "Hello" yields "ell".
    The string length will be at least 2*/
    public String withoutEnd(String str) {//Method declaration; access level-public, return String, name withoutEnd, parameters(String str)
        return str.substring(1, str.length() - 1); //method body - defines action, returns single stmt
    }//Hello - (e, (ello-1)) = ell



    /*The method firstTwo returns the first two characters of a string.
    If the string is shorter than length 2, it returns the entire string.*/
    public String firstTwo(String str) {
    if (str.length() < 2) {
        return str; // Return the string itself if it's shorter than 2 characters
      } else {
        return str.substring(0, 2); // Return the first two characters of the string
      }
    }



    // Main method to test the methods
    public static void main(String[] args) {
        Strings notes = new Strings();  // Create an instance of Strings

        // Test helloName
        System.out.println(notes.helloName("Alice")); // Output: Hello Alice!

        // Test makeAbba
        System.out.println(notes.makeAbba("hi", "bye")); // Output: hibyeebyhi

        // Test makeTags
        System.out.println(notes.makeTags("i", "Yay")); // Output: <i>Yay</i>

        // Test makeOutWord
        System.out.println(notes.makeOutWord("<<>>", "Yay")); // Output: <<Yay>>

        // Test extraEnd
        System.out.println(notes.extraEnd("Hello")); // Output: lololo

        // Test firstHalf
        System.out.println(notes.firstHalf("WooHoo"));   // Output: "Woo"

        // Test withoutEnd
        System.out.println(notes.withoutEnd("Hello")); //output: ell

        // Test firstTwo
        System.out.println(notes.firstTwo("KittyKat")); //output: Ki
    }
}


