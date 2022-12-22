
package siddharthsbegbasic;

public class GenericsTut {
    public static void main(String[] args) {
        Pair<String, Integer> obj1 = new Pair("Siddhartha", 1);
        Pair<Boolean, String> obj2 = new Pair(true, "Good Boy");
        
        obj1.getDetails();
        obj2.getDetails();
        System.out.println("value of PI is : "+(Math.PI));
    }
}
