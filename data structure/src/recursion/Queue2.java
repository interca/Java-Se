package recursion;

//二维数组来解决八皇后
public class Queue2 {
    int count=0;
    int max=8;
    int [][] nums=new int[max][max];
    //回溯
    public void process(int n){
       // System.out.println(n);
        if(n==max){
           /// System.out.println("ni");
            print();
        }else{
            for(int i=0;i<max;i++){
                int [][]help=new int[max][max];
                for(int w=0;w<max;w++){
                    for(int k=0;k<max;k++){
                        help[w][k]=nums[w][k];
                    }
                }
               nums[n][i]=1;
                if(judge(n,i)){
                    process(n+1);
                }
                nums=help;
            }
       }
    }
    //这个皇后在的行数，和列数是否和前面冲突
    public boolean judge(int n,int k){
        int i,j;
        for(i=0;i<n;i++){
            //取出前面每一个皇后的行数
            for(j=0;j<max;j++){
                if(nums[i][j]==1&&(k==j||Math.abs(i-n)==Math.abs(k-j))){
                    return false;
                }
            }

        }
        return true;
    }
    public void print(){
        count++;
        for(int i=0;i<max;i++){
            for(int j=0;j<max;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------------------------");
    }
    public static void main(String[] args) {
        Queue2 p=new Queue2();
        p.process(0);
        System.out.println(p.count);
    }
}
