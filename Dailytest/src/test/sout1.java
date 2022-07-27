package test;

import java.util.Arrays;
import java.util.Scanner;

public class sout1 {
    public static void main(String[] args) {
        int []a={3,3333,12,31,4,667,23,1,22,345};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int []a){
        int n=a.length;
        for(int i=0;i<n;i++){
            int flag=1;
            for(int j=0;j<n-i-1;j++){
                if(a[j+1]<a[j]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=0;
                }
            }
            if(flag==1)break;
        }
    }
}
class sort2{
    public static void main(String[] args) {
        int []a={3,3333,12,31,4,667,23,1,22,345};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static  void sort(int []a){
        int n=a.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min])min=j;
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
}
class sort3{
    public static void main(String[] args) {
        int []a={3,3333,12,31,4,667,23,1,22,345};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int []a){
        for(int i=1;i<a.length;i++){
            int flag=i;
            int temp=a[i];
            while(flag-1>=0&&a[flag-1]>temp){
                a[flag]=a[flag-1];
                flag--;
            }
            a[flag]=temp;
        }
    }
}
class sort4{
    public static void main(String[] args) {
        int []a={3,3333,12,31,4,667,23,1,22,345};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int []a){
        int n=a.length/2;
        for(;n>0;n=n/2) {
            for (int i = n; i < a.length; i++) {
                int flag = i;
                int temp = a[i];
                while (flag - n >= 0 && a[flag - n] > temp) {
                    a[flag] = a[flag - n];
                    flag = flag - n;
                }
                a[flag] = temp;
            }
        }
    }
}
class sort5{
    public static void main(String[] args) {
        int []a={3,3333,12,31,4,667,23,1,22,345};
        mrg(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void mrg(int []a,int left,int right){
        if(left>=right)return;
        int mid=(right+left)/2;
        mrg(a,left,mid);
        mrg(a,mid+1,right);
        sort(a,left,right,mid);
    }
    public static void sort(int []a,int left,int right,int mid){
        int []help=new int[right-left+1];
        int l=left;
        int r=mid+1;
        int index=0;
        while(l<=mid&&r<=right){
            if(a[l]<a[r]){
                help[index++]=a[l++];
            }else {
                help[index++]=a[r++];
            }
        }
        while(l<=mid){
            help[index++]=a[l++];
        }
        while(r<=right){
            help[index++]=a[r++];
        }
        for(int i=0;i<help.length;i++){
            a[left+i]=help[i];
        }
    }
}
//基数排序
class sort6{
    public static void main(String[] args) {
        int []a={3,3333,12,31,4,667,23,1,22,345};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int []a){
        int n=a.length;
        int [][]bin=new int[10][n];
        int []count=new int[10];
        int max=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>max)max=a[i];
        }
        //最大位数
        int  highmax=(max+"").length();
        int n1=1;
        for(int i=0;i<highmax;i++,n1=n1*10){
            //全部放入桶里
             for(int j=0;j<a.length;j++){
                 int w=a[j]/n1%10;
                 bin[w][count[w]]=a[j];
                 count[w]++;
             }
             int index=0;
             for(int k=0;k<bin.length;k++){
                 if(count[k]>0){
                     for(int w=0;w<count[k];w++){
                         a[index++]=bin[k][w];
                     }
                 }
                 count[k]=0;
             }
        }
    }
}
class Main{
    public static void main(String[]arg){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s="";
        linklist list=new linklist();
        for(int i=0;i<n;i++){
            list.print();
            s= in.next();
            switch(s){
                case "push":
                    int n1=in.nextInt();
                    list.push(n1);
                    break;
                case "top":
                    list.top();
                    break;
                case "pop":
                    list.pop();
                    break;
            }
        }
    }
}
//链表
class linklist{
    node head=null;
    //压入
    public void push(int val){
        node p=new node(val);
        if(head==null){
            head=p;
        }else {
            p.next=head;
            head=p;
        }
    }
    //抛出
    public void pop(){
        if(head==null){
            System.out.println("error");
            return;
        }
        System.out.println(head.data);
        head=head.next;
    }
    //查找堆栈顶部
    public void top(){
        if(head==null){
            System.out.println("error");
            return;
        }
        System.out.println(head.data);
    }
    public void print(){
        node root=head;
        while(root!=null){
            System.out.println(root.data);
            root=root.next;
        }
    }
}
//定义结点
class node{
    int data;
    node next=null;
    public node(int data){
        this.data=data;
    }
}
class likpi2{
    public static void main(String[] args) {
        int []nums={-3,-2,-5,3,-4};
        int target=-1;
        int i=1;
        int j=0;
        int n=nums.length;
        int pre=0;
        int last=0;
        int summin=nums[0]+nums[1]+nums[2];
        for(;i<n;i++){
            pre=0;
            last=n-1;
            while(pre<last&&pre<i&&last>i){
                int min=nums[pre]+nums[last]+nums[i];
                System.out.println("i="+i);
                System.out.println(min);
                if(Math.abs(min-target)<Math.abs(summin-target))summin=min;
                if(summin>target)last--;
                else if(summin<target)pre++;
                else {
                    System.out.println(summin);
                }
            }
        }
    }
}