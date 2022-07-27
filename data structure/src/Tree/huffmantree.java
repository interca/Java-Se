package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class huffmantree {
    //返回哈夫曼树
    public static Node1 creathuffmantree(int []a) {
        //将每个元素转换为Node然后放到集合中
        List<Node1> list = new ArrayList<>();
        for (int k : a) {
            list.add(new Node1(k));
        }
        while (list.size() > 1) {
            //从小到大排序
            Collections.sort(list);
            //取出权值最小的两颗二叉树,构建新的二叉树
            Node1 leftNode = list.get(0);
            Node1 rightNode = list.get(1);
            Node1 parent = new Node1(leftNode.value + rightNode.value);
            parent.left = leftNode;
            parent.right = rightNode;
            //删除掉两个最小结点
            list.remove(0);
            list.remove(0);
            list.add(parent);
        }
        return list.get(0);
    }
    //哈夫曼树
    public static void main(String[] args) {
        int []a={13,7,8,3,29,6,1};
        //得到哈夫曼树的头结点
        Node1 head=creathuffmantree(a);
        Node1 p=new Node1();
        p.pre(head);
    }
}
//创建结点
//让Node支持排序,实现comparable接口
class Node1 implements Comparable<Node1>{
    int value;//结点的权值
    Node1 left=null;
    Node1 right=null;

    public Node1(){

    }
    public Node1(int value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }


    @Override
    public int compareTo(Node1 o) {
        return Double.compare(this.value,o.value);
    }
    public void pre(Node1 head){
        if(head==null)return;
        System.out.println(head);
        pre(head.left);
        pre(head.right);
    }
}
