class Solution {
    public boolean validPalindrome(String s) {
        char arr[] = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else {
                // Option 1: Skip left character
                int l = i + 1;
                int r = j;

                while (l < r && arr[l] == arr[r]) {
                    l++;
                    r--;
                }

                if (l >= r) return true;

                // Option 2: Skip right character
                l = i;
                r = j - 1;

                while (l < r && arr[l] == arr[r]) {
                    l++;
                    r--;
                }

                return l >= r;
            }
        }

        return true;
    }
}