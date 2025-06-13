public class TernaryOperator{
    //Also Called Conditional Operator (?:)
    /* The goal of the operator is to decide,
     * which value should be assigned to the variable
     */
    public static void main(String args[]){
        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println("Value of b is : " + b);

        b = (a == 10) ? 20: 30;
        System.out.println("Value of b is : " + b);
    }
}