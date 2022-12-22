
package siddharthsbegbasic;

public class BegBasic6 {
    public static void main(String[] args) {
        int a,b;
        a=10;
        b=20;
        System.out.println("Before Swap");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("After Swap");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        
    }
}
