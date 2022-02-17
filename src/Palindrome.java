/*
This program created for checking if inputed string is palindrome
 */
// Main class
public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(isPalindrome(s));
        }
    }

    //This method reverse string
    public static String reverseString(String s) {
        String newString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            newString += s.charAt(i);
        }
        return newString;
    }

    //This method check if string is palindrome
    public static boolean isPalindrome(String s) {
        String newString = reverseString(s);
        return s.equals(newString);
    }
}
