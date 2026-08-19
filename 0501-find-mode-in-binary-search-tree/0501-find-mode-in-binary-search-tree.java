class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int[] findMode(TreeNode root) {
        inorder(root);

        int max = 0;

        // Find maximum frequency
        for (int count : map.values()) {
            max = Math.max(max, count);
        }

        ArrayList<Integer> list = new ArrayList<>();

        // Find all values having maximum frequency
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                list.add(key);
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);

        map.put(root.val, map.getOrDefault(root.val, 0) + 1);

        inorder(root.right);
    }
}