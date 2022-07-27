package Tree;
//顺序存储二叉树
public class Tree2 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        binarytree1 tree1=new binarytree1(a);
        tree1.preorder(0);
    }
}

class binarytree1{
    int []a;
    public  binarytree1(int []a){
        this.a=a;
    }
    //前序遍历
    public void preorder(int index){
        if(a==null||a.length==0){
            System.out.println("二叉树为空,不能遍历");
            return;
        }
        System.out.println(a[index]);
        //向左递归
        if(index*2+1<a.length){
            preorder(index*2+1);
        }
        //向右递归
        if(index*2+2<a.length){
            preorder(index*2+2);
        }
    }
}