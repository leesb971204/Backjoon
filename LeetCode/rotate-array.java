//https://velog.io/@cjhlsb
class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length; // nums = [1,2] , k = 3 예외처리
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<nums.length;i++)
        {
            que.offer(nums[i]);
        }
        for(int i=k;i<nums.length;i++)
        {
            nums[i] = que.poll();
        }
        for(int i=0;i<k;i++)
        {
            nums[i] = que.poll();
        }
    }
}