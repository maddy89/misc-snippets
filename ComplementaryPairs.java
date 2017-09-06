import java.util.HashSet;

/**
 * K-Complementary Pairs Class.
 *
 * @author Madhawa Bandara.
 */
public class ComplementaryPairs {

    /**
     * Prints K-Complementary Pairs.
     *
     * @param input input number array
     * @param k     k value
     */
    public static void printKComplementaryPairs(int[] input, int k) {

        HashSet numberSet = new HashSet<Integer>();

        /**
         * Adds the input elements to a HashSet. Eliminates duplicates.
         *
         */
        for (int i : input) {
            numberSet.add(i);
        }

        /**
         * Checks if the difference of k and a value is there in the above set.
         * If found prints and removes.
         *
         */
        for (int i : input) {
            if (numberSet.contains(k - i)) {
                System.out.println("{ " + i + ", " + (k - i) + " }");
                numberSet.remove(k - i);
            }
        }
        //if no input or no pairs found
        if (numberSet.isEmpty() || numberSet.size() == input.length) System.out.println("No pairs complementary found for "+k);

        /**
         * Overall time and memory complexity adds up to O(n).
         */

    }
}
