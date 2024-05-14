public class buildArrayFromPermutation {
    
        public int[] buildArray(final int[] nums) {
            final int n = nums.length;
            final int[] ans = new int[n];
    
            for(int i = 0; i < n; ++i)
                ans[i] = nums[nums[i]];
    
            return ans;
        }
    
        public static void main(String[] args) {
            // Example usage
            buildArrayFromPermutation solution = new buildArrayFromPermutation();
            int[] inputArray = {0, 2, 1, 5, 3, 4};
            int[] resultArray = solution.buildArray(inputArray);
    
            // Print the result array
            System.out.println("Result Array:");
            for (int num : resultArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
       
