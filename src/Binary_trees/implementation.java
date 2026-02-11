package Binary_trees;

import java.util.LinkedList;
import java.util.Queue;

public class implementation {
    public static class Node{
        Node node;
        int val;
        Node left ;
        Node right;

        public Node(int val){
            this.val=val;
        }

    }
    public static void print(Node root){
        if(root==null) return;
        System.out.print(root.val+"->");
        if(root.left!=null) System.out.print(root.left.val+"->");
        if(root.right!=null) System.out.print(root.right.val);
        System.out.println();
        print(root.left);
        print(root.right);

    }

    public static void preorder(Node root){
        if(root!=null){
            System.out.print(root.val);;
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void postorder(Node root){
        if(root!=null){
            postorder(root.right);
            postorder(root.left);
            System.out.print(root.val);}
    }
    static void levelorder(int root){

    }
    public static void nthlevel(Node root,int level){
            if(root!=null){
                if(level==1){
                    System.out.print(root.val);
                }

                nthlevel(root.left, level-1);
                nthlevel(root.right, level-1);
                    }
    }


    public static int max(Node root){
      if(root==null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b,c));


        }
        public static int height(Node root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
        }

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.val);
            inorder(root.right);
        }
    }
    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static void BFS(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        if(root==null) return;
        while(q.size()>0){
            Node temp = q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val);
            q.remove();
        }

    }


    public static void main(String[] args) {
        Node root= new Node(1);
        Node a= new Node(2);
        Node b= new Node(3);
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(6);
        Node f= new Node(7);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.left=e;
        b.right=f;
  //      print(root);
//        preorder(root);
//        System.out.println();
//        postorder(root);
//        System.out.println();
//        inorder(root);
//        System.out.println();
//        int size= height(root);
//        System.out.println(size);
//        //nthlevel(root,2);
        BFS(root);
    }

}
