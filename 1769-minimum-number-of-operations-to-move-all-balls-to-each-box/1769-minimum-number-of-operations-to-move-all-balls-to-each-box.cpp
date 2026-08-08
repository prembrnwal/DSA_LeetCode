class Solution {
public:
    vector<int> minOperations(string boxes) {
        int n = boxes.size();
        vector<int> vec;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = 0;
            for(int j=0;j<n;j++){
                if(boxes[j] == '1') sum+=abs(j-i);
            }
            vec.push_back(sum);
        }
        return vec;

    }
};