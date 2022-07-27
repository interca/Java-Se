package tree;

import java.util.*;

//给定一个数组，创建二插树
public class main {
    public static void main(String[] args) {
      int []a={1,2,3,4,5,6,7,8};
      Node[]nodes=new Node[a.length];
      Tree p=new Tree();
      p.creat(a,nodes);
     // p.preprint(p.head);
        //p.stackpreprint(p.head);
        p.queueprint();
    }
}
class Tree{
    Node head=null;

    public void creat(int []a,Node[]nodes){
          for(int i=0;i<a.length;i++){
              Node node=new Node(a[i]);
              nodes[i]=node;
              //设立头结点
              if(i==0)head=node;
          }
         for(int i=0;i<a.length;i++){
             if(i*2+1<a.length)
              nodes[i].left=nodes[i*2+1];
             if(i*2+2<a.length)
              nodes[i].right=nodes[i*2+2];
         }
    }
    public void print(Node node){
        if(node==null)return;
        print(node.left);
        System.out.println(node.val);
        print(node.right);
    }

    public  void preprint(Node node){
        if(node==null)return;
        System.out.println(node.val);
        preprint(node.left);
        preprint(node.right);
    }
    public  void stackpreprint(Node head1){
        Node root=head1;
        Stack<Node>stack=new Stack<>();
        while(stack.size()>0||root!=null){
            while(root!=null){
                //System.out.println(root.val);
                stack.push(root);
                root=root.left;
            }
            if(stack.size()>0){
                root=stack.pop();
                //System.out.println(root.val);
                root=root.right;
            }
        }
    }

    public  void  queueprint(){
        Node node=head;
        Queue<Node>queue=new LinkedList<>();
        queue.add(node);
        while(queue.size()>0){
            int size=queue.size();
            while(size>0) {
                node = queue.poll();
                System.out.print(node.val + " ");
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                size--;
            }
            System.out.println();
        }
    }
}
//树的结点
class Node{
    public  Node left=null;
    public  Node right=null;
    public  int val;

    public Node(int val) {
        this.val = val;
    }
}

class main2{
    public static void main(String[] args) {
        int []a={6,2,1,3,8,7,9,11,};
        binaryTree p=new binaryTree();
        for(int i=0;i<a.length;i++){
            p.insert(a[i]);
        }
        p.print(p.head);
    }
}
class binaryTree{
    public Node head=null;//头结点

    //中序遍历
    public void print(Node node){
        if(node==null)return;
        print(node.left);
        System.out.println(node.val);
        print(node.right);
    }

    //构建
    public void insert(int a){
        Node node=new Node(a);
        if(head==null){
            head=node;
            return;
        }
        Node root=head;
        //插入操作
        while(true){
            //根节点的值小于当前的数
            if(root.val<a){
                if(root.right==null){
                    root.right=node;
                    return;
                }else root=root.right;
            }else if(root.val>a){
                if(root.left==null){
                    root.left=node;
                    return;
                }else root=root.left;
            }else {
                System.out.println("无法构建二插搜索树");
                return;
            }
        }
    }
}

