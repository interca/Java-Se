package Tree2;

public class AvlTree {
    //旋转树
    public static void main(String[] args) {
        int []a={10,11,7,6,8,9};
        creatavltree p=new creatavltree();
        avlNode head;
        for(int i=0;i<a.length;i++){
            p.insert(a[i]);
            //进行右旋转,如果他的左子树的右子树高度大于它左子树的左子树的高度,就将
            //他的左子树进行左旋转
            head=p.root;
            if(p.leftheight(head)-p.rightheight(head)>1){
                if(head.left!=null&&p.rightheight(head.left)>p.leftheight(head.left)){
                      p.leftavl(head.left);
                      p.rightval(head);
                }else p.rightval(head);
            }else if(p.rightheight(head)-p.leftheight(head)>1){
                if(head.right!=null&&p.leftheight(head.right)>p.rightheight(head.right)){
                    p.rightval(head.right);
                    p.leftavl(head);
                }else p.leftavl(head);
            }
        }
        head=p.root;
        System.out.println(p.leftheight(head));
        System.out.println(p.nodeheight(head));
        System.out.println(p.rightheight(head));
        System.out.println(head.left);
        System.out.println(head.right);
    }
}
class creatavltree{
    //根结点
    avlNode root=null;

    //右旋转
    public void rightval(avlNode head){
        avlNode node=new avlNode(head.value);
        node.right=head.right;
        node.left=head.left.right;
        head.value=head.left.value;
        head.left=head.left.left;
        head.right=node;
    }
    //左旋转
    public void leftavl(avlNode head){
        avlNode node=new avlNode(head.value);
        node.left=head.left;
        node.right=head.right.left;
        head.value=head.right.value;
        head.right=head.right.right;
        head.left=node;
    }
    //返回左子树的高度
    public int leftheight(avlNode head){
        if(head.left==null)return 0;
        return nodeheight(head.left);
    }
    //返回右子树高度
    public int rightheight(avlNode head){
        if(head.right==null)return 0;
        return nodeheight(head.right);
    }
    //返回该结点的高度
    public int nodeheight(avlNode head){
        if(head==null)return 0;
        int left=nodeheight(head.left)+1;
        int right=nodeheight(head.right)+1;
        return Math.max(left,right);
    }
    //结点的插入
    public  void insert(int value){
        avlNode node=new avlNode(value);
        if(root==null){
            root=node;
            return;
        }
        avlNode head=root;
        while(true){
            if(value>head.value){
                if(head.right==null){
                    head.right=node;break;
                }else {
                    head=head.right;
                }
            }else {
                if(head.left==null){
                    head.left=node;
                    break;
                }else {
                    head=head.left;
                }
            }
        }
    }
    //中序遍历
    public  void midprint(avlNode head){
        if(head==null)return;
        midprint(head.left);
        System.out.println(head);
        midprint(head.right);
    }
}
//结点
class avlNode{
    avlNode left=null;
    avlNode right=null;
    int value;

    public avlNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "avlNode{" +
                "value=" + value +
                '}';
    }
}
