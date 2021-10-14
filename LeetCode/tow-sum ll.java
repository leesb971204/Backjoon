//https://velog.io/@cjhlsb
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int start = 0;
        int end = numbers.length-1;
        while(numbers[start] + numbers[end] != target)
        {
            if(numbers[start] + numbers[end] > target)
                end--;
            else
                start++;
        }
        arr[0] = start+1;
        arr[1] = end+1;
        return arr;
    }
}