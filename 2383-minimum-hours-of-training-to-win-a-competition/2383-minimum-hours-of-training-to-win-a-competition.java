class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int n = energy.length;
        int sumEnergy = 0;
        int ans=0;
        for(int i=0;i<n;i++)
            sumEnergy += energy[i];
        if(initialEnergy <= sumEnergy)
            ans+=(sumEnergy-initialEnergy)+1;

        int sumExperience = initialExperience;
        for(int i=0;i<n;i++)
            {
                if(experience[i]>=sumExperience)
                {
                    ans+=experience[i]-sumExperience+1;
                    sumExperience+=experience[i]-sumExperience+1;
                }
                sumExperience+=experience[i];
            }
        return ans;
    }
}