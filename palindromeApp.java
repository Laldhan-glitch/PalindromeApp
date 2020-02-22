//@author Laldhan
//This app will find out if a string is a palindrome
//Try the following strings for example
//mom, poop, race car, reviver, Kayak, RotaTor, Civic, RAcecar, radar radar

public class palindromeApp {
    public static void main(String[] args) {

        String a = "radar radar";
        a = a.replace(" ", "");
        a = a.toLowerCase();
        String reverse = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            reverse += a.charAt(i);
        }
        boolean palindrome = true;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }
        if (palindrome == true) {
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }


    }

}
