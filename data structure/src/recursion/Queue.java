package recursion;

//八皇后问题，回溯
public class                                      Queue {
        //比如nums={0,4,7,5,2,6,1,3}
        //就是第一个皇后在第一行，一列，第二个在二行，5列，以此类推
        int max=8;
        int []nums=new int[max];
        int count=0;
        int judgenumber=0;

        //放置第N个皇后
        //回溯主体
        public void check(int n){
            if(n==max){//如果是第八个
                print();
                return;
            }else{
               for(int i=0;i<max;i++){
                   nums[n]=i;
                   //判断第n+1个元素放到第i列时候是否冲突
                   if(judge(n)){//不冲突
                       check(n+1);
                   }
                   //冲突会重复执行，放到本行后面一个位置
               }
            }
        }

        //打印摆放位置
        public void print(){
            count++;
            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
            }
            System.out.println("");
        }
        //皇后不能在同一行，同一列，同一斜线
        //n表示第n个皇后
        //第一个条件判断第N个皇后是否和前n个在同一列，第二个条件判断，是否在同一斜线
        public boolean judge(int n){
            judgenumber++;
            for(int i=0;i<n;i++){
                if(nums[i]==nums[n]|| Math.abs(i-n)==Math.abs(nums[i]-nums[n])){//在同一列
                    return  false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
         Queue p=new Queue();
         p.check(0);
        System.out.println(p.count);
        System.out.println(p.judgenumber);
    }
}
