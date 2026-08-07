class Solution {
public:
    vector<int> findMissingElements(vector<int>& nums) {
        vector<int> result;
        unordered_map<int,int> mp;
        sort(nums.begin(),nums.end());

        for(int i=nums[0];i<=nums[nums.size()-1];i++){
            mp[i]++;
        }
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;
        }
        for(auto it: mp){
            if(it.second ==1) result.push_back(it.first);
        }
sort(result.begin(),result.end());
        return result;
    }
};