package siddharthsbegbasic;
import java.util.Scanner;
public class String7 {
    public static boolean isPalindrome(String str){
        int i, j;
        i = 0;
        j = str.length() - 1;
        
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
                
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String myStr;
        System.out.println("Enter a string : ");
        myStr = scn.nextLine();
        boolean result = isPalindrome(myStr);
        if(result){
            System.out.println("The String "+myStr+" is Palindrome.");
        }else{
            System.out.println("The String "+myStr+" is not Palindrome.");
        }
        
    }
    
}
