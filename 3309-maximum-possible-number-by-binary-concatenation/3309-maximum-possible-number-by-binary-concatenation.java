class Solution {
    public int maxGoodNumber(int[] nums) {

        int result = 0;
        String[] binaryForms = new String[nums.length];

        for (int i = 0; i < nums.length; i++)
            binaryForms[i] = getBinaryForm(nums[i]);

        String[][] permutations = {
            {binaryForms[0], binaryForms[1], binaryForms[2]},
            {binaryForms[0], binaryForms[2], binaryForms[1]},
            {binaryForms[1], binaryForms[0], binaryForms[2]},
            {binaryForms[1], binaryForms[2], binaryForms[0]},
            {binaryForms[2], binaryForms[0], binaryForms[1]},
            {binaryForms[2], binaryForms[1], binaryForms[0]}
        };

        for (String[] perm : permutations) {
            int num = getDecimalForm(perm[0], perm[1], perm[2]);
            result = Math.max(result, num);
        }

        return result;
    }

    private String getBinaryForm(int num) {
        StringBuilder binaryForm = new StringBuilder();

        while (num != 0) {
            binaryForm.append(num % 2);
            num = num / 2;
        }

        return binaryForm.reverse().toString();
    }

    private int getDecimalForm(String num1, String num2, String num3) {
        int decimalForm = 0;
        String num = num1 + num2 + num3;

        for (int i = 0; i < num.length(); i++)
            decimalForm += (num.charAt(i) - '0') * Math.pow(2, num.length() - 1 - i);

        return decimalForm;
    }
}