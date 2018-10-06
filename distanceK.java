/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class distanceK {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ArrayList<TreeNode> dist = new ArrayList<TreeNode>();
        find(root,target,dist);
        int size = dist.size();
        dist.add(target);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        System.out.println(size);
        for(int i=0;i< size ;i++){
            System.out.println(dist.get(i).val);
        temp = findup(dist.get(i),dist.get(i+1),  K - (size -i));
        if(temp != null) ans.addAll(temp);
            
        }
        ans.addAll(findlow(target,K));
     return ans;
    }
    public ArrayList<Integer> findup(TreeNode curr,TreeNode child, int k){
        if(k < 0 || curr == null) return null;
    
        ArrayList<Integer> p_ans = new ArrayList<Integer>();
        if(k == 0){
            p_ans.add(curr.val);
           return p_ans;
        } else if(child != curr.left && curr.left != null) {   
            return findlow(curr.left, k -1);
        } else if(child != curr.right && curr.right != null){
            return findlow(curr.right,k-1);
          } else {
            return null;
        }
     }
    
    public ArrayList<Integer> findlow(TreeNode curr, int k){
        if(k < 0) return null;
        ArrayList<Integer> p_ans = new ArrayList<Integer>();
        if(k == 0) {p_ans.add(curr.val);  
          return p_ans;
        } else {
         if(curr.left != null) p_ans.addAll(findlow(curr.left,k-1));
            
    
         if(curr.right != null) p_ans.addAll(findlow(curr.right,k-1));
            
        return p_ans;
       }
     }
    
    public boolean find(TreeNode root, TreeNode target, ArrayList<TreeNode> dist){
        boolean ans = false;
        if(root.left == target || root.right == target) {
            dist.add(root);
            return true;
        } else {
            if(root.left != null) ans = find(root.left,target,dist); 
            
            if(root.right != null) ans = ans || find(root.right,target,dist);
            if(ans == true) dist.add(0,root);
            return ans;
         }
        
    }
}
