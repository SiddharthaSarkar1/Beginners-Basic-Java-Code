package siddharthsbegbasic;
import java.util.Scanner;
public class Loops2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n, fact;
        fact = 1;
        System.out.println("Enter the value of n : ");
        n = scn.nextInt();
        
        if(n<0){
            System.out.println("Error!Factorial of a negative number doesn't exist.");
        }else{
           for(int i=1;i<=n;i++){
            fact =  fact * i;
            }
        System.out.println("Factorial of "+n+" is :"+fact); 
        }
    }
}
