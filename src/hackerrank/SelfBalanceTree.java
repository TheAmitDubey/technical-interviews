package hackerrank;

import common.ds.AdvanceTreeNode;

public class SelfBalanceTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static AdvanceTreeNode insert(AdvanceTreeNode root,int val)
    {
    	if(root == null){
            root = new AdvanceTreeNode();
            root.val = val;
            root.ht = setHeight(root);
            
            return root;
        }
        
        if(val <=root.val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        
        int balance = getHeight(root.left) - getHeight(root.right);
        
        if(balance > 1){
            if(getHeight(root.left.left) > getHeight(root.left.right)){
                root = rightRotate(root);
            }else{
                root.left = leftRotate(root.left);
                root = rightRotate(root);
            }
        } else if(balance < -1){
            if(getHeight(root.right.right) > getHeight(root.right.left)){
                root = leftRotate(root);
            }else{
                root.right = rightRotate(root.right);
                root = leftRotate(root);
            }
        } else{
            root.ht = setHeight(root);
        }
        
        return root;
    }

    static AdvanceTreeNode rightRotate(AdvanceTreeNode node){
    	AdvanceTreeNode newRoot = node.left;
        node.left = newRoot.right;
        newRoot.right = node;
        node.ht = setHeight(node);
        newRoot.ht = setHeight(newRoot);
        return newRoot;
    }

    static AdvanceTreeNode leftRotate(AdvanceTreeNode node){
    	AdvanceTreeNode newRoot = node.right;
        node.right = newRoot.left;
        newRoot.left = node;
        node.ht = setHeight(node);
        newRoot.ht = setHeight(newRoot);
        return newRoot;
    }

    static int setHeight(AdvanceTreeNode node){
        if(node == null){
            return -1;
        }
        
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

    static int getHeight(AdvanceTreeNode node){
        if(node == null){
            return -1;
        }
        
        return node.ht;
    }

}
