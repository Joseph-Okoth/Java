package Loop_Control.Enhanced_Loop;
/* This is mainly used to traverse
 * collection of elements including arrays
 */

public class Test {
    public static void main(String args[]){
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ){
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names = {"James", "Larry", "Tom", "Lacy"};
        for( String name : names ){
            System.out.print(name);
            System.out.print(",");
        }
    }
}
