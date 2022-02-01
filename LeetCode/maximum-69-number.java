class Solution {
    public int maximum69Number (int num) {
        String n = Integer.toString(num);
        n = n.replaceFirst("6","9");
        return Integer.parseInt(n);
    }
}