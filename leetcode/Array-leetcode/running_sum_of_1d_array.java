class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i] = arr[i - 1] + nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.runningSum(nums);
        System.out.print("The running sum of the array is: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

