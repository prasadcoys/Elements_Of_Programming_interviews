package leetcodemay;

public class CousinsInBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        short[] heights = new short[ 101 ];
        recursivelyIsCousins(root, x, y, 0, null, heights);
        if (heights[ x ] == 0 || heights[ y ] == 0) {
            return false;
        }
        if (heights[ x ] == heights[ y ]) {
            return true;
        }
        return false;
    }

    private void recursivelyIsCousins(
            TreeNode root, int x, int y,
            int level, TreeNode parent,
            short[] heights) {
        if (root == null){
            return;
        }
        if (root.left != null && root.right != null) {
            if ((root.left.val == x && root.right.val == y) ||
                    (root.left.val == y && root.right.val == x)) return;
        }

        heights[root.val] = (short) (level+1);
        if (root.val == x || root.val == y){
            return;
        }
        recursivelyIsCousins(root.left,x,y,level+1,root,heights);
        recursivelyIsCousins(root.right,x,y,level+1,root,heights);
    }
}
