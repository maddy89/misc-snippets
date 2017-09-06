import java.math.BigInteger;

/**
 * Mathematical Utilities.
 *
 */
public final class MathUtil {

    private MathUtil() {
        // No instantiation
    }

    /**
     * Calculates Greatest Common Denominator for two numbers.
     *
     * @param a
     * @param b
     * @return
     */
    public static int gcd(int a, int b) {
        BigInteger bigA = BigInteger.valueOf(a);
        BigInteger bigB = BigInteger.valueOf(b);
        return bigA.gcd(bigB).intValue();
    }

    /**
     * Calculates Greatest Common Denominator for the given numbers.
     *
     * GCD(a_1,a_2,a_3,...,a_n) = GCD( GCD(a_1, a_2), a_3, a_4,..., a_n )
     *
     * @param numbers
     * @return
     */
    public static int gcd(int... numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("At least two numbers should be given");
        }

        if (numbers.length == 2) {
            return gcd(numbers[0], numbers[1]);
        }

        int[] params = new int[numbers.length - 1];

        // Calculate GCD of first two numbers and use it as first value
        params[0] = gcd (numbers[0], numbers[1]);

        // Copy the rest of the values as is
        System.arraycopy(numbers, 2, params, 1, numbers.length - 2);

        // Recursive Call - Calculate GCD
        return gcd(params);
    }

    /**
     * Finds least common multiple of two given numbers.
     *
     * Formula : a * b / gcd(a,b)
     *
     * @param a first number
     * @param b second number
     * @return LCM of the two numbers
     */
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    /**
     * Finds least common multiple of a series of given numbers.
     *
     * Formula : LCM(a_1,a_2,a_3,...,a_n) = LCM( LCM(a_1, a_2), a_3, a_4,..., a_n )
     *
     * @param numbers array of numbers
     * @return LCM of the numbers
     */
    public static int lcm(int... numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("At least two numbers should be given");
        }

        if (numbers.length == 2) {
            return lcm(numbers[0], numbers[1]);
        }

        int[] params = new int[numbers.length - 1];

        // Calculate LCM of first two numbers and use it as first value
        params[0] = lcm (numbers[0], numbers[1]);

        // Copy the rest of the values as is
        System.arraycopy(numbers, 2, params, 1, numbers.length - 2);

        // Recursive Call - Calculate LCM
        return lcm(params);
    }

    /**
     * Finds least common multiple of an array of given numbers.
     *
     * @param numbers array of numbers
     * @return LCM of the numbers
     */
    public static int lcmOfArray(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("At least two numbers should be given");
        }

        if (numbers.length == 2) {
            return lcm(numbers[0], numbers[1]);
        }

        int[] params = new int[numbers.length - 1];

        // Calculate LCM of first two numbers and use it as first value
        params[0] = lcm (numbers[0], numbers[1]);

        // Copy the rest of the values as is
        System.arraycopy(numbers, 2, params, 1, numbers.length - 2);

        // Recursive Call - Calculate LCM
        return lcmOfArray(params);
    }

}