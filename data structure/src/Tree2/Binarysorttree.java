package Tree2;
//二插搜索树的插入删除和查找
public class Binarysorttree {
    public static void main(String[] args) {
         int []arr={7,3,10,12,5,1,9};
         Creatbinarysorttree creatbinarysorttree=new Creatbinarysorttree();
         for(int i=0;i<arr.length;i++){
             creatbinarysorttree.insert(arr[i]);
         }
         Node root=creatbinarysorttree.root;
         creatbinarysorttree.delect(root,3);
       creatbinarysorttree.midprint(root);
    }
}
class Creatbinarysorttree{
    Node root=null;
    //二插搜索树的插入
    public void insert(int value){
        Node node=new Node(value);
        if(root==null){
            root=node;
            return;
        }
        Node head=root;
        while(true){
            if(value>head.value){
                if(head.right==null){
                    head.right=node;
                    break;
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
    //二插搜索树的删除
    public Node delect(Node head,int value){
        Node temp;
        if(head==null) System.out.println("要删除的元素没有找到");
        //找的值大于当前结点，向右递归
        else if(value>head.value){
            head.right=delect(head.right,value);
            //反之向左递归
        }else if(value<head.value){
            head.left=delect(head.left,value);
            //找到了结点
        }else if(value==head.value){
            //左右两边都有结点的情况，就从左边找出最大。右边找出最小来代替当前结点
            if(head.left!=null&&head.right!=null){
                temp=findmax(head.left);
                head.value=temp.value;
                head.left=delect(head.left,temp.value);
            }else {
                if(head.left==null)
                   head=head.right;
                else head=head.left;
            }
        }
        return head;
    }
    public void midprint(Node head){
        if(head==null)return;
        midprint(head.left);
        System.out.println(head);
        midprint(head.right);
    }
    //找最大值
    public Node findmax(Node head){
        while(head.right!=null){
            head=head.right;
        }
        return head;
    }
    //找最小值
    public Node findmin(){
        Node head=root;
        while(head.left!=null){
            head=head.left;
        }
        return head;
    }
}
class Node{
    int value;
    Node left=null;
    Node right=null;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
