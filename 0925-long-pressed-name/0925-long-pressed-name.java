// class Solution {
//     public boolean isLongPressedName(String name, String typed) {
//         char[] a1 = name.toCharArray();
//         char[] a2 = typed.toCharArray();
//         int i=0;
//         int j=0;
//         int n=a1.length;

//         while(i<n-1){
//             if(a1[i]==a2[j] && a2[j]==a2[j+1]) j++;
//             if(a2[j]!=a2[j+1]){
//                 i++;
//                 j++;
//             }
//             if(a1[i]!=a2[j] ) return false; 
//         }
//         return true;
//     }
// }
class Solution {
    public boolean isLongPressedName(String name, String typed) {

        char[] a1 = name.toCharArray();
        char[] a2 = typed.toCharArray();

        int i = 0;
        int j = 0;

        while (j < a2.length) {

            if (i < a1.length && a1[i] == a2[j]) {
                i++;
                j++;
            }
            else if (j > 0 && a2[j] == a2[j-1]) {
                j++;
            }
            else {
                return false;
            }
        }

        return i == a1.length;
    }
}