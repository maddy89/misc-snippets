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
         */
        if (input == null || input.isEmpty()) {
            return false;
        }

        /**
         * Remove whitespaces and convert to a char array.
         *
         */
        char[] charArray = input.trim().toCharArray();

        for (int i=0, j=charArray.length - 1; j > i; ++i, --j) {
            /**
             * Time complexity - O(n*1/2) = O(n)
             */
            if (charArray[i] != charArray[j]) {
                return false;
            }
        }
        return true;
    }

}
