class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();

        int mid = n / 2;

        char[] arr = s.toCharArray();
        Arrays.sort(arr, 0, n / 2);

        for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
            arr[j] = arr[i];
        }

        return new String(arr);
    }
}