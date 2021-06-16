/**
 * Class Lab1FizzBuzz:
 * <p>
 * Print the numbers 1 to 100, but for multiples of 3 print “Fizz”, for multiples of 5 print “Buzz”.
 * For numbers that are multiples of both three and five print “FizzBuzz”.
 */
public class Lab1FizzBuzz {

    /**
     * Main method passes array of string args to be executed
     *
     * @param args
     */
    public static void main(String[] args) {

        // For loop iterates from 1 to 100
        for (int z = 1; z < 101; z++) {

            // Use modulus operator to test remainders and print appropriately
            if (z % 15 == 0)
                System.out.println("FizzBuzz");
            else if (z % 3 == 0)
                System.out.println("Fizz");
            else if (z % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(z);
        }

    }

}
