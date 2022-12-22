
package siddharthsbegbasic;
import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scn.nextInt();
        System.out.println("Table of "+n+" is : ");
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}
