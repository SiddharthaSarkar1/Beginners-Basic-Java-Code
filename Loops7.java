
package siddharthsbegbasic;
import java.util.Scanner;
public class Loops7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, max, step, lcm;
        lcm = 0;
        
        System.out.println("Enter two number : ");
        a = scn.nextInt();
        b = scn.nextInt();
        
        if(a>b){
            max = step = a;
        }else{
            max = step = b;
        }
        
        while(a != 0){
        if(max%a==0 && max%b==0){
            lcm = max;
            break;
        }
        max = max+step;
    }
        System.out.println("LCM of "+a+" and "+b+" is : "+lcm);
    }
}
