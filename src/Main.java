public class Main
{
    public static void main(String[] args)
    {
       // intOperandA, intOperandB, intSum, intProduct, intDifference, intQuotient, intModulo
       int intOperandA = 10;
       int intOperandB = 5;

       int intProduct= 0;
       int intSum = 0;
       int intDifference= 0;
       int intQuotient= 0;
       int intModulo= 0;


       intSum = intOperandA + intOperandB;
        System.out.println( "The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct= intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intDifference= intOperandA - intOperandB;
        System.out.println( "The Difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println( "The Quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient + " with a remainder of " + intModulo);

        // rest of the int statement go here for product, difference, quotient, modulo
        double doubleOperandA = 62.5;
        double doubleOperandB = 21.5;
        double doubleSum= doubleOperandA + doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum );

        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct );

        System.out.println("The Difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference );

        System.out.println("The Quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient );

    }
}