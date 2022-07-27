package Array;

//稀疏数组和二维数组转换
public class SparseArray1 {
    public static void main(String[] args) {
        //0-无棋子,1-黑，2-蓝
        int [][]chessArr1=new int[11][11];
          chessArr1[1][2]=1;
          chessArr1[2][3]=2;
          int count=0;
        System.out.println("二维数组是：");
       for(int[]k:chessArr1){
           for(int a:k){
               if(a!=0)count++;
               System.out.print(a+" ");
           }
           System.out.println("");
       }
       //创建稀疏数组
       // System.out.println(count);
       int[][]sparseArrs=new int[count+1][3];
       sparseArrs[0][0]=sparseArrs[0][1]=11;
       sparseArrs[0][2]=count;
       //存放值
        int k=1;
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(chessArr1[i][j]!=0){
                    sparseArrs[k][0]=i;
                    sparseArrs[k][1]=j;
                    sparseArrs[k][2]=chessArr1[i][j];
                    k++;
                }
            }
        }
        System.out.println("稀疏数组是：");
        for(int[]arr:sparseArrs){
            for(int arr2:arr){
                System.out.print(arr2+"\t");
            }
            System.out.println("");
        }
       //稀疏变二维：

        int [][]array=new int[sparseArrs[0][0]][sparseArrs[0][1]];
        for(int i=1;i<=sparseArrs[0][2];i++){
            array[sparseArrs[i][0]][sparseArrs[i][1]]=sparseArrs[i][2];

        }
        for(int i=0;i<sparseArrs[0][0];i++){
            for(int j=0;j<sparseArrs[0][1];j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
