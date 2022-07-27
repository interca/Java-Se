package Array;
//数组模拟队列,循环队列
import java.util.Scanner;

public class Qucue1 {
    private int real;//尾
    public int front;//头
    public  int maxsize;//队列最大值
    public int []qucue;

    public Qucue1(int maxsize) {
        this.maxsize = maxsize;
        qucue=new int[maxsize];
        real=0;
        front=0;
    }
    //判断队列是否满
    public boolean isFull(){
        return (real+1)%maxsize==front;
    }
    //判断队列是不是空
    public boolean isEmpty(){
        return real==front;
    }
    //添加元素
    public void push(int number){
        if(isFull()){
            System.out.println("队列满，无法添加");
        }else {
            qucue[real] = number;
            real = (real + 1) % maxsize;
        }
    }
    //删除
     public void pop(){
        if(isEmpty()){
            System.out.println("队列为空");
        }else{
          int value=qucue[front];
          front=(front+1)%maxsize;
            System.out.println(value);
        }
    }
    public void print(){
        if(isEmpty()){
            System.out.println("队列为空，无法打印");
        }else{
            int size=(real+maxsize-front)%maxsize;
            for(int i=front;i<size+front;i++){
                System.out.printf("qucue[%d]=%d",i%maxsize,qucue[i%maxsize]);
            }
        }
    }
    public static void main(String[] args) {

        int maxsize;//队列最大值
        Scanner in=new Scanner(System.in);
        System.out.println("输入队列最大值：");
        maxsize=in.nextInt();
        Qucue1 p=new Qucue1(maxsize);
        int []qucue=new int[maxsize];

        int choice;
        int number;
        while(true){
            System.out.println("输入选择：1-插入，2-删除，3-打印");
            choice=in.nextInt();
            switch ((choice)){
                case 1:
                    System.out.println("输入数字");
                    number= in.nextInt();
                    p.push(number);
                    break;
                case 2:
                    p.pop();
                    break;

                case 3:
                    p.print();
                    System.out.println("");
                    break;
            }
        }
    }

}
