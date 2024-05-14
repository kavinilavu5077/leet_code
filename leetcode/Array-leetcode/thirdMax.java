public class thirdMax {
        public int thirdMax(int[] nums) {
            // taking long data type since array can contain Integer.MIN_VALUE
            long max = Long.MIN_VALUE, sMax = Long.MIN_VALUE, tMax = Long.MIN_VALUE;
            for (int i : nums) {
                if (i > max) {
                    tMax = sMax;
                    sMax = max;
                    max = i;
                } else if (i > sMax && i != max) {
                    tMax = sMax;
                    sMax = i;
                } else if (i > tMax && i != sMax && i != max) {
                    tMax = i;
                }
            }
            
            // if thirdMax was not updated, return the first Max
            return tMax == Long.MIN_VALUE ? (int) max : (int) tMax;
        }
    
        public static void main(String[] args) {
            thirdMax solution = new thirdMax();
    
            // Test cases
            int[] nums1 = {3, 2, 1};
            System.out.println("Third maximum of [3, 2, 1]: " + solution.thirdMax(nums1)); // Expected output: 1
    
            int[] nums2 = {1, 2};
            System.out.println("Third maximum of [1, 2]: " + solution.thirdMax(nums2)); // Expected output: 2 (since there is no third distinct maximum)
    
            int[] nums3 = {2, 2, 3, 1};
            System.out.println("Third maximum of [2, 2, 3, 1]: " + solution.thirdMax(nums3)); // Expected output: 1
    
            int[] nums4 = {1, 2, Integer.MIN_VALUE};
            System.out.println("Third maximum of [1, 2, Integer.MIN_VALUE]: " + solution.thirdMax(nums4)); // Expected output: Integer.MIN_VALUE
    
            int[] nums5 = {1, 1, 2};
            System.out.println("Third maximum of [1, 1, 2]: " + solution.thirdMax(nums5)); // Expected output: 2 (since there is no third distinct maximum)
    
            int[] nums6 = {1, 2, 2, 5, 3, 5};
            System.out.println("Third maximum of [1, 2, 2, 5, 3, 5]: " + solution.thirdMax(nums6)); // Expected output: 2
    
            int[] nums7 = {1, 2, Integer.MIN_VALUE, 3};
            System.out.println("Third maximum of [1, 2, Integer.MIN_VALUE, 3]: " + solution.thirdMax(nums7)); // Expected output: 1
        }
    }
    

