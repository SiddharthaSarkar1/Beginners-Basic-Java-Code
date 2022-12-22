package siddharthsbegbasic;
import java.util.Scanner;
public class IfElseTwo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch;
        boolean isLowerCase, isUpperCase;
        System.out.println("Enter a character : ");
        ch = scn.next().charAt(0);
        
        isLowerCase = (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u');
        isUpperCase = (ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U');
        
        if(!(Character.isAlphabetic(ch))){
            System.out.println("The Value is Non-Alphabetic Value.");
        }else if(isLowerCase || isUpperCase){
            System.out.println("The Character is a Vowel.");
        }else{
            System.out.println("The Character is a Consonant.");
            
        }
    }
}
