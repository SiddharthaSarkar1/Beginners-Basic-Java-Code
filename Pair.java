//This is basically a Generic class
package siddharthsbegbasic;

public class Pair<X, Y> {
    X x;
    Y y;
    public Pair(X x, Y y){
        this.x = x;
        this.y = y;
    }
    public void getDetails(){
        System.out.println("Details that you have given is : "+x+" and "+y);
    }
}
