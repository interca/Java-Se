package likou;

public class likou11 {
    public static void main(String[] args) {
        int[][]area = {{0,1,0,0,0},{0,0,0,0,1},{0,0,1,0,0}};
        int n=area.length;
        int m=area[0].length;
        int count=m*n;
        int [][]graph=new int[m*n][n*m];
        int [][]help=new int[n*m][n*m];
        int flag=0;
        for(int i=0;i<m*n;i++){
            for(int k=0;k<n;k++){
                for(int w=0;w<m;w++){
                    if(area[k][w]==1){
                        int z=(k+1)*(w+1);
                        graph[i][z]=help[i][z]=1;
                    }
                }
            }
        }
        for(int i=0;i<count;i++){
            for(int j=0;j<count;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class likk11{
    public static void main(String[] args) {
        int []chess = {0,0,0,0,0,0,0,0,0,0,0,0};
        likk11 p=new likk11();
        System.out.println(p.minSwaps(chess));
    }
    public int minSwaps(int[] chess) {
        int min=1000000000;
        int sum=0;
        int count=0;//记录黑棋子
        for(int i=0;i<chess.length;i++){
            if(chess[i]==1)count++;
        }
        if(count==1)return 0;
        int []help=new int[chess.length];
        for(int i=0;i<count;i++){
            help[i]=1;
        }
        for (int w = 0; w < chess.length; w++) {
            if (help[w] != chess[w]) sum++;
        }
        int index=0;
        for(int i=count;i<=chess.length;i++) {
            if (sum / 2 < min) min = sum / 2;
            help[index++] = 0;
            if(i<chess.length)help[i] = 1;
            if(help[index-1]!=chess[index-1])sum++;
            else sum--;
            if(i<chess.length){
                if(help[i]!=chess[i])sum++;
                else sum--;
            }
        }
        return min;
    }
}