public class Test{
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        int c = 0;

/* Simple assignment operator
 * Assigns values from the right side operands to left side operand.
 * Example: C = A + B will assign value of A +B into C
 */
        c = a + b;
        System.out.println("c = a + b = " + c);

/* Add AND assignment operator.
 * It adds right operand to the left operand and assign the results to tleft operand
 * Example C += A is equivalent to C = C + A
 */
        c += a ;
        System.out.println("c += a = " + c );

/* Subtract AND assignment operator.
 * It subtracts right operand from the left operand and assign the result to left operand.
 * Example:C -= A is equivalent to C = C – A
 */
        c -= a;
        System.out.println("c -= a = " + c);

/* Multiply AND assignment operator.
 * It multiplies right operand with the left operand and assign the result to left operand.
 * Example: C *= A is equivalent to C = C * A
 */
        c *= a;
        System.out.println("c *= a = " + c);

/* Divide AND assignment Operator
 * It divides left operand with the right operand and assign the result to left operand.
 * Example: C /= A is equivalent to C = C / A
 */
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);

/* Modulus AND assignment operator
 * It takes modulus using two operands and assign the result to left operand.
 * Example: C %= A is equivalent to C = C % A
 */
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a = " + c);

/* Left shift AND assignment operator
 * Example: C <<= 2 is same as C = C << 2
 */
        c <<= 2;
        System.out.println("c <<= 2 = " + c);

/* Right shift AND assignment operator
 * Example: C >>= 2 is same as C = C >> 2
 */
        c >>= 2;
        System.out.println("c >>= 2 = " + c);

/* Bitwise AND assignment operator.
 * Example: C &= 2 is same as C = C & 2
 */
        c &= 2;
        System.out.println("c &= 2 = " + c);

/* Bitwise exclusive OR and assignment operator.
 * Example: C ^= 2 is same as C = C ^ 2
 */
        c ^= a;
        System.out.println("c ^= a = " + c);

/* Bitwise inclusive OR and assignment operator. 
 * Example: C |= 2 is same as C = C | 2
*/
        c |= a;
        System.out.println("c |= a = " + c);
    }
}