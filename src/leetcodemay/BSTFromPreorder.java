package leetcodemay;

public class BSTFromPreorder {
    public TreeNode bstFromPreorder(int[] preOrder)
    {
        TreeNode rootNode = new TreeNode(preOrder[0]);
        for (int i = 1; i < preOrder.length; i++) {
            insertNodeInto(rootNode,preOrder[i]);
        }
        return rootNode;
    }

    private void insertNodeInto(TreeNode currentRoot, int val) {
        if (val< currentRoot.val){
            if ( currentRoot.left == null){
                currentRoot.left = new TreeNode(val);
                return;
            }
            insertNodeInto(currentRoot.left,val);
            return;
        } else {
            if(currentRoot.right == null){
                currentRoot.right = new TreeNode(val);
                return;
            }
            insertNodeInto(currentRoot.right,val);
            return;
        }

    }

}
