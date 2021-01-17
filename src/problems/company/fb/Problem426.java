package problems.company.fb;

import common.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Problem426 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(9);

        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(10);

        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(3);

        System.out.println(maxSumLevel(root));
    }

    public static int maxSumLevel(TreeNode root){
        int max = Integer.MIN_VALUE;

        if(root == null){
            return max;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            int sum = 0;

            while(size >0){
                TreeNode curr = queue.poll();
                sum += curr.val;
                size--;
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }

            if(sum > max){
                max = sum;
            }
        }

        return max;
    }
}
