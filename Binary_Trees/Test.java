public class Test{
    public static void main(String[] args){
        BSTree tree = new BSTree();
        tree.insert(48);
        tree.insert(31);
        tree.insert(78);
        tree.insert(20);
        tree.insert(34);
        tree.insert(54);
        tree.insert(92);
        tree.insert(50);

        tree.inorder();
        System.out.println("");
        tree.postorder();
        System.out.println("");
        tree.preorder();
        System.out.println("");
    }
}
