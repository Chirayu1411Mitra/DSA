/* Node - int value
          Node right
          Node left
   Size - total nodes
   height = maximux number of edges from node to leafnode(last node)
   level = diff of height from node to root node


types of binary trees -
complete BT - last level should be full
full/Strict BT - each node has either 0 or 2 children
Perfect BT - all internal nodes have 2 chils all leaf nodes are on same level
Height Balanced tree= Avg hight o(logn)
skewed binary - easch node has only 1 child
ORdered BT - each node has some property EG BST


o
*/
package BT;
import java.util.Scanner;

public class basic {
    class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    private Node root;

    public void insert (Scanner scanner){
        System.out.println("Enter Root Node Value");
        int data = scanner.nextInt();
        root = new Node(data);
        insert(scanner,root);
    }
    public void insert(Scanner scanner, Node node){
        System.out.println("Do u want to add val on left of" + node.data);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value to left of "+  node.data);
            int data = scanner.nextInt();
            node.left= new Node(data);
            insert(scanner,node.left);
        }
        System.out.println("Do u want to add val on right of" + node.data);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Entre the valu at right of" + node.data );
            int data = scanner.nextInt();
            node.right = new Node(data);
            insert(scanner,node.right);
        }
    }
    public void display(){
        display(root, "");
    }

    private void display(Node node, String s) {
        if(node==null){
            return;
        }
        System.out.println(s+node.data);;;;;
        '//6

    ]
        '
        display(node.left,s+"\t");
        display(node.right,s+"\t");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        basic tree = new basic();
        tree.insert(scanner);
        tree.display();



    }

}
