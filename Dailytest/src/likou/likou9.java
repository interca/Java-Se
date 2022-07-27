package likou;

public class likou9 {
    public static void main(String[] args) {
     likou9 p=new likou9();
        System.out.println(p.uniquePaths(3,7));
    }
    int sum;
    public void find(int m,int n,int i,int j){
        System.out.println(i+","+j+"m-1="+(m-1)+"n-1="+(n-1));
        System.out.println("sum="+sum);
        if(i==m-1&&j==n-1){
            sum++;
            return;
        }
        for(int w=0;w<2;w++){
            if(w==0&&i+1<m){
                find(m,n,i+1,j);
            }
            if(w==1&&j+1<n){
                find(m,n,i,j+1);
            }
        }
    }
    public int uniquePaths(int m, int n) {
        sum=0;
        find(m,n,0,0);
        return sum;

    }
}
