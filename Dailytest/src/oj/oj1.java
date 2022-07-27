package oj;

import org.testng.annotations.Test;

import java.util.*;

public class oj1 {
    @Test
    public  void test1(){
        System.out.println((int)Math.sqrt(2));
        System.out.println(5.0==5);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //节日天使和浇水的人数
        int n=in.nextInt();
        int m=in.nextInt();
        int []a=new int[n+1];
        for(int i=1;i<=m;i++){
            int x1=in.nextInt();
            int x2= in.nextInt();
            for(int j=x1;j<=x2;j++){
                a[j]++;
            }
        }
        int index=0;
        int max=0;
        int flag=0;
        for(int i=1;i<=n;i++){
            if(a[i]==0||a[i]>1){
                index=i;
                max=a[i];
                flag=1;
                break;
            }
        }

        if(flag==1) System.out.println((index)+" "+max);
        else {
            System.out.println("YES");
        }
    }
}
class oj12{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        if(n>1&&n<=3) System.out.println("Y");
        else if(n<=0) System.out.println("N");
        else {
            int flag=1;
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1) System.out.println("Y");
            else System.out.println("N");
        }
    }
}

class Main11{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []ax=new int[n];
        int []ay=new int[n];
        int []lx=new int[n];
        int []ly=new int[n];
        for(int i=0;i<n;i++){
            ax[i]=in.nextInt();
            ay[i]=in.nextInt();
            lx[i]=in.nextInt();
            ly[i]=in.nextInt();
        }
        int x=in.nextInt();
        int y=in.nextInt();
        int w=0;
        for(int i=0;i<n;i++){
            int x1=ax[i]+lx[i];
            int x2=ax[i];
            int y1=ay[i];
            int y2=ay[i]+ly[i];
            System.out.println(x2+" "+x1+" "+y1+" "+y2);
            if(x>=x2&&x<=x1&&y>=y1&&y<=y2){
                w=i+1;
            }
        }
        if(w==0)System.out.println(-1);
        else System.out.println(w);
    }
}
 class Main222{
    static int k;
    public static void main(String[]args){
         Scanner in=new Scanner(System.in);
         String c= in.next();
        System.out.println(c);
        String a="20011219";
        String b="20021221";
        System.out.println(a.compareTo(b));
    }
    public static void method(int[]num) {
        System.out.println(Arrays.toString(num)+" "+k);
       int n=num.length;
        int index1 = 0;
        int mid;
        int l = 0;
        int r = n - 1;
        if((num[n-1]-k)<=0){
            System.out.println(0);
            return;
        }
        while (l <= r) {
            mid = (l + r) / 2;
            if ((num[mid]-k) <= 0) {
                index1 = mid;
                l = mid + 1;
            } else r = mid - 1;
        }
        if (index1 < n && index1 >= 0 && (num[index1]-k) == 0) index1++;
        if (index1 < n && index1 >= 0) {
            System.out.println(num[index1]);
            k=num[index1];
        }else System.out.println(0);

    }
}
class soultion{
    public static void main(String[] args) {
         soultion p=new soultion();
         String []nums = {"102","473","251","814"};
       int [][] queries = {{1,1},{2,3},{4,2},{1,2}};
        System.out.println(Arrays.toString(p.smallestTrimmedNumbers(nums, queries)));
        List<Integer>list=new ArrayList<>();
        Collections.sort(list);

    }
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int n=nums.length;
        int m=queries.length;
        sort []sort=new sort[n];
        int []help=new int[m];
        for(int i=0;i<m;i++){
            int k=queries[i][0];
            int trim=queries[i][1];
            for(int j=0;j<n;j++){
               if(nums[j].length()<trim){
                   sort[j]=new sort("0",j);
               }else {
                   sort[j]=new sort(nums[j].substring(nums[j].length()-trim),j);
               }
            }
           // System.out.println(Arrays.toString(sort));
            Arrays.sort(sort);
            help[i]=sort[k-1].age;
        }
        return help;
    }
}
class sort implements Comparable<sort>{
    String s;
    int age;

    public sort(String s, int age) {
        this.s = s;
        this.age = age;
    }

    @Override
    public int compareTo(sort o) {
        return this.s.compareTo(o.s);
    }

    @Override
    public String toString() {
        return "sort{" +
                "s='" + s + '\'' +
                ", age=" + age +
                '}';
    }
}
class Main22211{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int pre=0;
        int last=1;
        int [] nums=new int[n];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        int max=1;
        map.put(nums[0],0);
        while(last<n){
           if(map.containsKey(nums[last])==false){
              map.put(nums[last],last);
              last++;
           }else{
               max=Math.max(last-pre,max);
               int k=map.get(nums[last]);
               if(k+1>=n)break;
               map.put(nums[last],last);
               pre=k+1;
           }
        }
        System.out.println(max);
    }
}

class Main2222{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        List<int[]>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int k1=in.nextInt();
            int k2=in.nextInt();
            int []a=new int[2];
            a[0]=(k1);
            a[1]=(k2);
            list.add(a);
        }
        Sort sort=new Sort();
        Collections.sort(list,sort);
        for(int[]a:list){
            System.out.println(Arrays.toString(a));
        }
        int last=list.get(0)[1];
        int i=1;
        while(i<n){
            int k1=list.get(i)[0];
            int k2=list.get(i)[1];
            if(k1<=last){
                if(last<=k2)last=k2;
            }else if(k1>last){
                last=k2;
                sum++;
            }
            i++;
            System.out.println(last);
        }
        System.out.println(sum+1);
    }
}
class Sort implements Comparator<int[]>{


    @Override
    public int compare(int[] o1, int[] o2) {
        return Integer.compare(o1[0],o2[0]);
    }
}
class Main2233{
    public static void main(String[] args) {
        Sort sort=new Sort();
        int[][]a={{1,2},{-1,2}};
        Arrays.sort(a,sort);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class Main2222221{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int count=0;
        String max1="999999999999999999";
        String max2="999999999999999999";
        int n=in.nextInt();
        String s="";
        HashMap<String,String>map=new HashMap<>();
        for(int i=0;i<n;i++){
            s=in.next();
            map.put(s,s.substring(6,14));
        }
        System.out.println(map);
        int m=in.nextInt();
        for(int i=0;i<m;i++) {
            s = in.next();
            if (map.containsKey(s)) {
                if (max1.substring(6, 14).compareTo(s.substring(6, 14)) > 0) {
                    max1 = s;
                }
                count++;
            } else {
                if (max2.substring(6, 14).compareTo(s.substring(6, 14)) > 0) {
                    max2 = s;
                }
            }
        }
        System.out.println(count);
        if(count==0)System.out.println(max2);
        else System.out.println(max1);
    }
}