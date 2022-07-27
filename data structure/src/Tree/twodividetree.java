package Tree;

import java.util.Scanner;

//二叉树实现
public class twodividetree {
    public static void main(String[]arg){
        Scanner in=new Scanner(System.in);
        int choice;
        node str;
        Binarytree tree=new Binarytree();
        tree.insert(new node(6,"黄裕甲"));
        tree.insert(new node(4,"裕甲"));
        tree.insert(new node(8,"黄甲"));
        tree.insert(new node(5,"黄裕"));
        tree.insert(new node(7,"啊甲"));
        out:
        while(true){
            System.out.println("输入你的选择：1-插入结点，2-前序，3-中序，4-后序,5-前序查找：" +
                    "6-中序查找,7-后序查找，8-删除：");
            choice=in.nextInt();
            switch (choice){
                case 1: System.out.println("输入号码和姓名:");
                       tree.insert(new node(in.nextInt(), in.next()));break;
                case 2:tree.firstprint(tree.root);break;
                case 3:tree.midprint(tree.root);break;
                case 4:tree.lastprint(tree.root);break;
                case 5:
                    System.out.println("输入查找id：");
                    str=tree.prefind(tree.root, in.nextInt());
                    if(str==null) System.out.println("没有找到");
                    else System.out.println(str);
                    break;
                case 6:
                    System.out.println("输入查找id：");
                     str=tree.midfind(tree.root, in.nextInt());
                    if(str==null) System.out.println("没有找到");
                    else System.out.println(str);
                    break;
                case 7:
                    System.out.println("输入查找id：");
                    str=tree.lastfind(tree.root, in.nextInt());
                    if(str==null) System.out.println("没有找到");
                    else System.out.println(str);
                    break;
                case 8:
                    System.out.println("输入删除的id：");
                    tree.delect(tree.root, in.nextInt());
            }
        }

    }
}
class Binarytree{
    node root=null;
    //插入
     public void insert(node Node){
         if(root==null){
             root=Node;
         }else {

             node root1=root;
             while(true){
                 if(Node.id>root1.id){
                     if(root1.right==null){
                         root1.right=Node;
                         break;
                     }else {
                         root1=root1.right;
                     }
                 }else {
                     if(root1.left==null){
                         root1.left=Node;
                         break;
                     }else{
                         root1=root1.left;
                     }
                 }
             }
         }
     }
    //前中后续遍历
    public void firstprint(node root1){
        if(root1==null)return;
        System.out.println(root1);
        firstprint(root1.left);
        firstprint(root1.right);
    }
    public void midprint(node root1){
        if(root1==null)return;
        midprint(root1.left);
        System.out.println(root1);
        midprint(root1.right);
    }
    public void lastprint(node root1){
        if(root1==null)return;
        lastprint(root1.left);
        lastprint(root1.right);
        System.out.println(root1);
    }
    //前序查找
    public node prefind(node root1,int id){
         if(root1==null)return null;
         if(root1.id==id)return root1;
         node str;
         str=prefind((root1.left),id);
         if(str==null&&root1.id!=id){
             str=prefind(root1.right,id);
         }
         return str;
    }
    //中序查找
    public node midfind(node root1,int id){
         if(root1==null)return null;
         node str;
         str=midfind(root1.left,id);
         if(str==null){
             if(root1.id==id)return root1;
             else str=midfind(root1.right,id);
         }else {
             return str;
         }
         return str;
    }
    //后序查找
    public node lastfind(node root1,int id){
         if(root1==null)return null;
         node str;
         str=lastfind(root1.left,id);
         if(str!=null)return str;
         else {
             str=lastfind(root1.right,id);
             if(str!=null)return str;
             else {
                 if(root1.id==id)return root1;
                 else return null;
             }
         }
    }
    //删除
    public void delect(node root1,int id){
         if(root1==null)return;
         if(root1.left!=null&&root1.left.id==id){
             root1.left=null;
             return;
        }
         if(root1.right!=null&&root1.right.id==id){
             root1.right=null;
             return;
         }
         delect(root1.left,id);
         delect(root1.right,id);
    }
}
//树结点
class node{
    int id;
    String name;
    node left=null;
    node right=null;

    public node(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
