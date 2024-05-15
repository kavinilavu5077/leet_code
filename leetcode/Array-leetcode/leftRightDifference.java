public class leftRightDifference {
    
        public int[] leftRightDifferences(int[] nums) {
            int n = nums.length;
            int leftSum[] = new int[n];
            for (int i = 1; i < n; i++) {
                leftSum[i] = leftSum[i-1] + nums[i-1];
            }
            int rightSum[] = new int[n];
            for (int i = n - 2; i >= 0; i--) {
                rightSum[i] = rightSum[i+1] + nums[i+1];
            }
            int ans[] = new int[n];
            for (int i = 0; i < n; i++) {
                ans[i] = Math.abs(leftSum[i] - rightSum[i]);
            }
            return ans;
        }
    
        public static void main(String[] args) {
            leftRightDifference solution = new leftRightDifference();
            int[] nums = {2, 3, 5, 1, 4};
            int[] result = solution.leftRightDifferences(nums);
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }
     

