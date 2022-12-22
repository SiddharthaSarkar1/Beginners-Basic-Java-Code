
package siddharthsbegbasic;
import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String myString = "Java program is awesome";
        System.out.println("Enter a character : ");
        char checkChar = scn.next().charAt(0);
        int count = 0;
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i) == checkChar){
                count ++;
            }
        }
        System.out.println("Number of character "+checkChar+" is : "+count);
    }
}
