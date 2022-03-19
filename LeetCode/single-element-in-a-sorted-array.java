class Solution {
    public int singleNonDuplicate(int[] nums) {
         int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low + high)/2;
            boolean left = false;
            boolean right = false;
            if(mid - 1>=0 && nums[mid-1]==nums[mid]){
                left = true;
            }
            if(mid + 1<nums.length && nums[mid+1]==nums[mid]){
                right = true;
            }
            
            if(!left && !right){
                return nums[mid];
            }
            if((!left && mid%2!=0) || (!right && mid%2==0)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return nums[low];
    }
}