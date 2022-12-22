package siddharthsbegbasic;
import java.util.Scanner;
public class IfElse3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int one,two, three;
        System.out.println("Enter three numbers : ");
        one = scn.nextInt();
        two = scn.nextInt();
        three = scn.nextInt();
        
        if(one>two && one>three){
            System.out.println(one+" is the largest number.");
        }else if(two>one && two>three){
            System.out.println(two+" is the largest number.");
        }else{
            System.out.println(three+" is the largest number.");
        }
    }
}
