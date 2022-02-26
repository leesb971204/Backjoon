class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] arr = new int[26];
        int max = -1;
        for (int i = 0; i < s.length(); ++i) {
            int idx = s.charAt(i) - 'a';
            if (arr[idx] > 0) {
                max = Math.max(max, i - arr[idx]);
            }else {
                arr[idx] = i + 1;
            }
        }
        return max;
    }
}