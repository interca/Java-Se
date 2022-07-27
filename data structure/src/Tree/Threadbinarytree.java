package Tree;

import java.util.Scanner;

//线索化二叉树
public class Threadbinarytree {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int choice;
        Treenode str;
        BinarTree1 tree=new BinarTree1();
        tree.insert(new Treenode(6,"黄裕甲"));
        tree.insert(new Treenode(4,"裕甲"));
        tree.insert(new Treenode(8,"黄甲"));
        tree.insert(new Treenode(5,"黄裕"));
        tree.insert(new Treenode(7,"啊甲"));
        tree.thread(tree.root);

        tree.threadmidprint();
    }
}
//定义二叉树
class BinarTree1{
   Treenode root=null;
    //指向当前结点的前驱结点的指针,也就是保留上一个结点，方便线索化;
    Treenode pre=null;
    //需要线索化的结点
   public void thread(Treenode node){
       //如果为空，不能线索化
       if(node==null){
           return;
       }
       //先左子树
       thread(node.left);
       //处理当前结点的前驱结点
       //如果左指针为空，那就让左指针指向前驱结点
       if(node.left==null) {
           node.left = pre;
           node.leftType=1;
       }
       //处理上一个结点的右子树,如果上一个结点右边为空，让其指向当前结点
       if(pre!=null&&pre.right==null){
           pre.right=node;
           pre.rightType=1;
       }
       pre=node;
       //处理右子树
       thread(node.right);

   }
   //中序遍历线索化二叉树
    public  void threadmidprint(){
       Treenode node=root;
       while(node!=null){
           //循环找到leftType==1的点
           while(node.leftType==0){
               node=node.left;
           }
           System.out.println(node);
           //然后看当前结点的指针是不是指向后继结点,是，一直输出
           while(node.rightType==1){
               node=node.right;
               System.out.println(node);
           }
          //替换这个遍历的结点
           node=node.right;
       }
    }
    public void insert(Treenode Node){
        if(root==null){
            root=Node;
        }else {

            Treenode root1=root;
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
    public void firstprint(Treenode root1){
        if(root1==null)return;
        System.out.println(root1);
        firstprint(root1.left);
        firstprint(root1.right);
    }
    public void midprint(Treenode root1){
        if(root1==null)return;
        midprint(root1.left);
        System.out.println(root1);
        midprint(root1.right);
    }
    public void lastprint(Treenode root1){
        if(root1==null)return;
        lastprint(root1.left);
        lastprint(root1.right);
        System.out.println(root1);
    }
    //前序查找
    public Treenode prefind(Treenode root1,int id){
        if(root1==null)return null;
        if(root1.id==id)return root1;
        Treenode str;
        str=prefind((root1.left),id);
        if(str==null&&root1.id!=id){
            str=prefind(root1.right,id);
        }
        return str;
    }
    //中序查找
    public Treenode midfind(Treenode root1,int id){
        if(root1==null)return null;
       Treenode str;
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
    public Treenode lastfind(Treenode root1,int id){
        if(root1==null)return null;
        Treenode str;
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
    public void delect(Treenode root1,int id){
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
//结点
class Treenode{
    int id;
    String name;
    Treenode left=null;
    Treenode right=null;
    //leftType==0指向左子树，如果为一，指向前驱结点
    int leftType;
    //rightTtpe=0指向右子树，否则为一时候，指向后继结点
    int rightType;


    public Treenode(int id, String name) {
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
