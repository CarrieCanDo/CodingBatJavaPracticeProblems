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

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1);

        return front + back;
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

        // Test missingChar
        System.out.println(notes.missingChar("kitten", 1)); // Output: ktten
        System.out.println(notes.missingChar("kitten", 0)); // Output: itten
        System.out.println(notes.missingChar("kitten", 4)); // Output: kittn
    }
}