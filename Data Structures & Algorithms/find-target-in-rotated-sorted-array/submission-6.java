class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // 1️⃣ Found the target
            if (nums[mid] == target) {
                return mid;
            }

            // 2️⃣ Check which half is sorted
            if (nums[left] <= nums[mid]) {
                // Left half is sorted

                if (nums[left] <= target && target < nums[mid]) {
                    // Target is inside left half
                    right = mid - 1;
                } else {
                    // Target must be in right half
                    left = mid + 1;
                }

            } else {
                // Right half is sorted

                if (nums[mid] < target && target <= nums[right]) {
                    // Target is inside right half
                    left = mid + 1;
                } else {
                    // Target must be in left half
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}