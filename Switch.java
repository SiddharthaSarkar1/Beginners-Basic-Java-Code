package siddharthsbegbasic;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int one, two, res=0;
        System.out.println("Enter two number : ");
        one = scn.nextInt();
        two = scn.nextInt();
        System.out.println("Enter the operator(+,-,*,/) : ");
        char opr = scn.next().charAt(0);
        
        switch(opr){
            case '+' : 
               res = one + two;
               break;
            case '-' : 
                res = one - two;
                break;
            case '*' : 
                res = one * two;
                break;
            case '/' :
                res = one / two;
                break;
            default :
                System.out.println("Enter proper operator.");
        }
        System.out.println("The result is : "+res);
    }
}
