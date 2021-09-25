class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while(low <= high)
        {
            mid = (low+high) / 2;
            if(nums[mid] < target) //배열 오른쪽 부분 탐색
                low = mid + 1;
            else if(nums[mid] > target) //배열 왼쪽 부분 탐색
                high = mid - 1;
            else
                return mid;
        }
        return -1; //탐색 실패
    }
}