/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class pathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        findpath(root,sum,new LinkedList<Integer>(),ans);
        return ans;
    }
    public void findpath(TreeNode root, int sum,List<Integer> temp,List<List<Integer>> ans) {
        //Case1. There is no path from this node
        if(root ==null) return;
        //Case2. This node is end of a path
        temp.add(root.val); 
        if(sum - root.val == 0 && root.left == null && root.right == null) { 
           ans.add(new LinkedList<Integer>(temp));
         } else {
            //Case3. there might be a path from this node
            if(root.left != null) findpath(root.left,sum - root.val,temp,ans);
            if(root.right != null) findpath(root.right,sum - root.val,temp,ans); 
           
        }
         temp.remove(temp.size()-1);
    }   
}

