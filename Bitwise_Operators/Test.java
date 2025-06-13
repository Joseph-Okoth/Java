public class Test(
    public static void main(String args[]){
        int a = 60; /* 60 = 0011 1100 */
        int a = 13; /* 13 = 0000 1101 */
        int c = 0;

// Binary AND Operator copies a bit to the result if it exists in both operands.     
        c = a & b; /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

// Binary OR Operator copies a bit if it exists in either operand.
        c = a | b; /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

// Binary XOR Operator copies the bit if it is set in one operand but not both
        c = a ^ b; /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

// Binary Ones complement Operator is unary and has the effect of 'flipping' bits.
        c = ~a;  /* -61 = 1100 0011 */
        System.out.println("c = ~a = " + c);

// Binary Left Shift Operator. 
// The Left Operands value is moved left by the number of bits specified by the right operand.
        c = a << 2; /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

// Binary Right Shift Operator
// The left operands value is moved right by the number of bits specified by the right operand.
        c = a >> 2; /* 15 = 1111 */
        System.out.println("a >> 2 = " + c);

//Shift right zero fill operator
/* The left operands value is moved right by the number
 * of bits specified by the right operand and shifted
 * values are filled up with zeros
 */
        c = a >>> 2; /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);
    }
)