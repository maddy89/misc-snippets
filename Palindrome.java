/**
 * Palindrome class.
 *
 * @author Madhawa Bandara.
 */
public class Palindrome {

    /**
     * Checks if a string is a palindrome.
     * @param input input string
     * @return true if palindrome, false if not.
     */
    public boolean isPalindrome(String input) {

        /**
         * Reject null or empty strings.
         *
         * Assumption - treated them as non-palindromes hence returns false
         */
        if (input == null || input.isEmpty()) {
            return false;
        }

        /**
         * Remove whitespaces.
         *
         * Assumption -
         *  Escape characters/whitespaces in the middle of the string are treated as characters
         *  whereas leading and trailing whitespaces are ignored.
         */
        char[] charArray = input.trim().toCharArray();

        for (int i=0, j=charArray.length - 1; j > i; ++i, --j) {
            /**
             * Assumption - Ignore the memory taken for the input string
             *
             * Needs create a memory chunk of lengthOf(charArray) cells, hence,
             * Memory complexity - O(n)
             *
             *
             * Loop contents gets executed lengthOf(charArray) times/2, hence,
             * Time complexity - O(n*1/2) = O(n)
             */
            if (charArray[i] != charArray[j]) {
                return false;
            }
        }
        return true;
    }

}
