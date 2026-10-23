// class Solution {
//     public int path1(int[] nums1, int[] nums2,int n,int m,int count){
//         for(int i=0;i<n;i++){
//             for(int j=0,k=1;j<m;j++,k++){
//                 if(nums1[i]*nums1[i] == nums2[j] * nums2[k]){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
//     public int path2(int[] nums1, int[] nums2,int n,int m,int count){
//         for(int i=0;i<n;i++){
//             for(int j=0,k=1;j<m;j++,k++){
//                 if(nums2[i]*nums2[i] == nums1[j] * nums1[k]){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
//     public int numTriplets(int[] nums1, int[] nums2) {
//         int n=nums1.length;
//         int m =nums2.length;
//         int count=0;

//        int o=path1(nums1,nums2,n, m, count);
//        int p=path2(nums1,nums2,n, m, count);

    
            
//         return o+p;
//     }
// }
    
// class Solution {

//     public int path1(int[] nums1, int[] nums2) {
//         int count = 0;
//         int n = nums1.length;
//         int m = nums2.length;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 for (int k = j + 1; k < m; k++) {
//                     if ((long) nums1[i] * nums1[i]
//                             == (long) nums2[j] * nums2[k]) {
//                         count++;
//                     }
//                 }
//             }
//         }

//         return count;
//     }

//     public int path2(int[] nums1, int[] nums2) {
//         int count = 0;
//         int n = nums1.length;
//         int m = nums2.length;

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 for (int k = j + 1; k < n; k++) {
//                     if ((long) nums2[i] * nums2[i]
//                             == (long) nums1[j] * nums1[k]) {
//                         count++;
//                     }
//                 }
//             }
//         }

//         return count;
//     }

//     public int numTriplets(int[] nums1, int[] nums2) {
//         return path1(nums1, nums2) + path2(nums1, nums2);
//     }
// }




class Solution {

    public long count(int[] nums, int[] ans) {
        int n = nums.length;
        int m = ans.length;
        long cnt = 0;

        Arrays.sort(ans);

        for (int i = 0; i < n; i++) {
            int j = 0;
            int k = m - 1;
            long tar = 1L * nums[i] * nums[i];

            while (j < k) {
                long pro = 1L * ans[j] * ans[k];

                if (pro < tar) {
                    j++;
                } else if (pro > tar) {
                    k--;
                } else {
                    if (ans[j] == ans[k]) {
                        long len = k - j + 1;
                        cnt += len * (len - 1) / 2;
                        break;
                    }

                    int leftVal = ans[j];
                    int rightVal = ans[k];
                    long leftCount = 0;
                    long rightCount = 0;

                    while (j < k && ans[j] == leftVal) {
                        leftCount++;
                        j++;
                    }

                    while (k >= j && ans[k] == rightVal) {
                        rightCount++;
                        k--;
                    }

                    cnt += leftCount * rightCount;
                }
            }
        }

        return cnt;
    }

    public int numTriplets(int[] nums1, int[] nums2) {
        return (int) (count(nums1, nums2) + count(nums2, nums1));
    }
}
