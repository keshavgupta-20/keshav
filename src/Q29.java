class Q29 {

    public static int findHighestOccurrence(String str) {
        // Create an array to store the frequency of each character
        int[] charCount = new int[256]; // Using 256 to cover all ASCII characters

        // Count the frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Find the highest frequency
        int max = -1;
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > max) {
                max = charCount[i];
            }
        }

        // Return the highest frequency
        return max;
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
                "success",
                "occurrenes",
                "Honorificabilitudinitatibus",
                "AabbbccDDEEee"
        };

        // Expected outputs
        int[] expectedOutputs = {
                3, // 's' appears 3 times in "success"
                3, // 'c' appears 3 times in "occurrenes"
                8, // 'i' appears 8 times in "Honorificabilitudinitatibus"
                4  // 'e' appears 4 times in "AabbbccDDEEee"
        };

        // Running the test cases
        for (int i = 0; i < testCases.length; i++) {
            int result = findHighestOccurrence(testCases[i]);
            System.out.println("Input: " + testCases[i]);
            System.out.println("Output: " + result);
            System.out.println("Expected: " + expectedOutputs[i]);
            System.out.println(result == expectedOutputs[i] ? "Test passed" : "Test failed");
            System.out.println();
        }
    }
}
