
package siddharthsbegbasic;

import java.util.Scanner;
public class IfElse5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year;
        System.out.println("Enter the year : ");
        year = scn.nextInt();
        
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year+" is a LEAP YEAR.");
                }else{
                     System.out.println(year+" is not a LEAP YEAR.");
                }
            }else{
                 System.out.println(year+" is a LEAP YEAR.");
            }
        }else{
            System.out.println(year+" is not a LEAP YEAR.");
        }
    }
}
