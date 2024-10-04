class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        // Step 1: Calculate the frequency of each card in the deck
        Map<Integer, Integer> freq = new HashMap<>();
        for (int card : deck) {
            freq.put(card, freq.getOrDefault(card, 0) + 1);
        }

        // Step 2: Find the GCD of all the frequencies
        int gcd = -1;
        for (int count : freq.values()) {
            if (gcd == -1) {
                gcd = count;
            } else {
                gcd = gcd(gcd, count);
            }
        }

        // Step 3: If GCD is greater than 1, return true. Otherwise, return false.
        return gcd >= 2;
    }

    // Helper method to calculate GCD of two numbers
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
