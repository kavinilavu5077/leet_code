class concatenation_of_array{
    public int[] getConcatenation(int[] nums) {
        // Initialize an array with double the size of the input array.
        int[] resultantArr = new int[2 * nums.length];
        // Copy the numbers from input array to resultant array.
        for (int i = 0; i < resultantArr.length; i++) {
            // Use modulo (%) for cycling through the index of the input array.
            resultantArr[i] = nums[i % nums.length];
        }
        return resultantArr;
    }

    public static void main(String[] args) {
        // Example usage
        concatenation_of_array solution = new concatenation_of_array();
        int[] inputArray = {1, 2, 3};
        int[] concatenatedArray = solution.getConcatenation(inputArray);

        // Print the concatenated array
        System.out.println("Concatenated Array:");
        for (int num : concatenatedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

