
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int size = s.size();
        if (size == 0) return 0;
        if (size == 1) return 1;

        unordered_map<char, int> map;
        int i = 0;
        int j = 0;

        int maxLenght = 0;
        int length = 0;

        while (j < size) {
            if (map.count(s[j]) && map[s[j]] >= i) {
                i = map[s[j]] + 1;
            }

            map[s[j]] = j;

            length = j - i + 1;
            maxLenght = max(maxLenght, length);

            j++;
        }

        return maxLenght;
    }
};
