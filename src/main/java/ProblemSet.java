/*

    Author - Salma Danane
    File Name - Problem Set Unit 5
    Date Created - May 15th 2026
    Date Last Modified - May 20th 2026

*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;


public class ProblemSet {

public static void main(String args[]) {

Scanner input = new Scanner(System.in);


// Welcome/Introduction message
System.out.println("Welcome to the Text Analyzer!\n Input a sentince or paragraph: ");



//all of my variables

int wordCount; // counting words of user input
int spaceCount; // counting spaces in user input
int charCount; // counting the charactors of user input
int vowelCount; // counting vowel (a,e,i,o,u) of user input
String text; // text/paragraph/sentence to analyze from user input


vowelCount = 0; // vowel count starts at 0 for actual code (line 36)





        // user text alterations
       
text = input.nextLine(); // getting user input
text = text.trim(); // getting rid of uneeded spaces in user input

charCount = text.length(); // initializing count for characters




        // actual code starts here
       
if (text.length() == 0) {
    wordCount = 0;
    spaceCount = 0;
} else {
    spaceCount = 0;
    for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == ' ') {
            spaceCount++;
        }
    }
    wordCount = spaceCount + 1;
}

for (int i = 0; i < text.length(); i++) { // checking the count for spaces
if (text.charAt(i) == ' ') {
spaceCount++;
}
wordCount = spaceCount + 1; // getting the word count again/ initailizing word count
}




//Line 36 refrence
for (int i = 0; i < text.length(); i++) { // counting my vowels in for loop
char c = Character.toLowerCase(text.charAt(i));

if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { // if it contains any of these vowels it will be added in the counter
vowelCount++; // adding to my value
}
}




// Final print statments
System.out.println("Total Characters: " + charCount); // showing user characters
System.out.println("Total Words: " + wordCount); // showing user words
System.out.println("Total Vowels: " + vowelCount); // showing user vowels
System.out.println("Total Spaces: " + spaceCount); // showing user their total spaces

input.close(); // closing my scanner

// end of code
