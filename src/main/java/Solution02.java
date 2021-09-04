/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

/* EXERCISE #2 INFORMATION

    DESCRIPTION:
    Create a program that prompts for an input string and displays output that shows the input string and the number
    of characters the string contains.

    CONSTRAINTS
        - Be sure the output contains the original string
        - Use a single output statement to construct the output
        - Use a built-in function of the programming language to determine the length of the string

    EXAMPLE OUTPUT
        - What is the input string? Homer
        - Homer has 5 characters.
 */

/*
    PSEUDOCODE
        create new Scanner
        Prompt user for string
        read string using Scanner
        Calculate string length
        Output to console "<string> has <stringLength> characters"
 */

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] arr){
        Scanner stringReader = new Scanner(System.in);

        System.out.print("What is the input String? ");
        String str = stringReader.nextLine();

        System.out.print(str+" has "+str.length()+" characters.");
    }
}
