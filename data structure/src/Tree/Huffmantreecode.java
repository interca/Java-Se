package Tree;

import java.util.*;

//哈夫曼编码
public class Huffmantreecode {

    //存放编码，对应字符对应编码
    static HashMap<Byte,String>huffmancode=new HashMap<>();
    //得到哈夫曼编码
    static void getcode(Node2 node,String code,StringBuilder stringBuilder){
     StringBuilder stringBuilder1=new StringBuilder(stringBuilder);
     //将code加入stringBuilder1
     stringBuilder1.append(code);
     if(node!=null){
         //非叶子结点
         if(node.data==null){
             //向左递归
             getcode(node.left,"0",stringBuilder1);
             //向右递归
             getcode(node.right,"1",stringBuilder1);
         }else {//找到叶子结点
             huffmancode.put(node.data,stringBuilder1.toString());
         }
     }
    }
    //返回编码
    static byte[]getarray(byte[]bytes){
        StringBuilder stringBuilder=new StringBuilder();
        for(byte b:bytes){
            stringBuilder.append(huffmancode.get(b));
        }
        System.out.println(stringBuilder.length());
        int len=0;
        if(stringBuilder.length()%8==0){
            len=stringBuilder.length()/8;
        }else {
            len=stringBuilder.length()/8+1;
        }
        byte[]by=new byte[len];
        int index=0;
        for(int i=0;i<stringBuilder.length();i=i+8){
            String str;
            if(i+8>stringBuilder.length()){
                str=stringBuilder.substring(i);
            }
            else str=stringBuilder.substring(i,i+8);
            by[index++]=(byte)Integer.parseInt(str,2);
        }
        return by;
    }
    public static void main(String[] args) {
      String str="i like like like java do you like a java";
          //转为Byte数组
      byte[] b=str.getBytes();
      //获得集合
      List<Node2>node=getNodes(b);
      //获得哈夫曼树的头节点
      Node2 head=creatHuffantree(node);
      //打印
       //prepriint(head);
        StringBuilder stringBuilder=new StringBuilder();
        getcode(head,"",stringBuilder);
        for(Map.Entry<Byte,String>entry:huffmancode.entrySet()){
            System.out.println("key="+(char)(byte)entry.getKey()+",value="+entry.getValue());
        }
        byte[]bytes=getarray(b);
        System.out.println(Arrays.toString(bytes));
    }
    //获得List
    public static List<Node2>getNodes(byte[]bytes){
        List<Node2>list=new ArrayList<>();
        //统计字符个数
        HashMap<Byte,Integer>map=new HashMap<>();
        for(Byte b:bytes){
            map.put(b,map.getOrDefault(b,0)+1);
        }
        for(Map.Entry<Byte,Integer>entry:map.entrySet()){
            list.add(new Node2(entry.getKey(),entry.getValue()));
        }
        return list;
    }
    //创建哈夫曼树
    public static Node2 creatHuffantree(List<Node2> list){
        while(list.size()>1){
            Collections.sort(list);
            //取出权值最小两个节点合成一个新节点
            Node2 leftNode=list.get(0);
            Node2 rightNode=list.get(1);
            Node2 parent =new Node2(leftNode.weight+rightNode.weight);
            parent.left=leftNode;
            parent.right=rightNode;
            list.remove(0);
            list.remove(0);
            list.add(parent);
        }
        return list.get(0);
    }
    //前遍历
    public static void prepriint(Node2 head){
        if(head==null)return;
        System.out.println(head);
        prepriint(head.left);
        prepriint(head.right);
    }
}
class Node2 implements Comparable<Node2>{
    Byte data=null;//存放数据
    int weight;//权值
    Node2 left;
    Node2 right;

    public Node2(int weight) {
        this.weight = weight;
    }

    public Node2(byte data, int weight) {
        this.data = data;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Node2{" +
                "data=" + data +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Node2 o) {
        return Double.compare(this.weight,o.weight);
    }
}
