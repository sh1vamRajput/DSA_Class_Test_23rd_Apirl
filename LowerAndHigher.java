public class LowerAndHigher {
    class Solution {
        public int lowerBound(int[] nums, int target, int n) {
            int low = 0;
            int high = n - 1;
    
            while (low <= high) {
                int mid = (low + high )/ 2;
    
                if (nums[mid] >= target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }
        
        public int searchInsert(int[] nums, int target) {
            int n = nums.length;
            return lowerBound(nums, target, n);
        }
    }
    
}
