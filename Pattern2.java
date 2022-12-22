//Hollow Rectangle
package siddharthsbegbasic;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row, column;
        System.out.println("Enter the row : ");
        row = scn.nextInt();
        System.out.println("Enter the column : ");
        column = scn.nextInt();
        
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i==0||i==row-1||j==0||j==column-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
