package algorithm.treeTest;

public class TreeTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(100);
        TreeNode a = new TreeNode(80);
        TreeNode b = new TreeNode(110);
        TreeNode c = new TreeNode(90);
        root.left = a;
        root.right = b;
        a.right = c;
        a.left = null;
        c.left = null;
        c.right = null;

        int num = (0+8)>>1;

        Integer.toString(num);
        System.out.println(num);
    }
}
