//Elena Voinu

import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]){

        // create a scanner object
        Scanner sc = new Scanner(System.in);

        // ask user for input
        System.out.println("Enter a string to be reversed: ");

        // read the input and save it to the scanner object
        String input = sc.nextLine();

        // creates a StringBuffer with the passed user input as the initial
        //content of the buffer
        StringBuffer sb = new StringBuffer(input);

        // reverse the existing string in the buffer and return it
        String reversedString = sb.reverse().toString();
        System.out.println("The reversed string is " +  reversedString);

        
    }
}
