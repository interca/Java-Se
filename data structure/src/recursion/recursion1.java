package recursion;
//递归，回溯迷宫问题
public class recursion1 {
    //找路，从i,j位置开始，找到返回true,否则false
    //从（1,1）开始，终点（6,5）
    //map[i][j]为0，没有走过，当为1，表示墙壁，2-表示通路（不能走），
    // 3-表示已经走过（不能走）
    //策略：下->右->上->左
    //如果改点走不通，回溯
    public static boolean findroot(int [][]map,int i,int j){
           if(map[6][5]==2){//通路已经找到
               return  true;
           }else{
               if(map[i][j]==0){//如果当前路等于零，这个点还没有走过
                   //按照下，右，上左，假定这套路走得通
                   map[i][j]=2;
                   if(findroot(map,i+1,j)){
                       return true;
                   }else if(findroot(map,i,j+1)){
                       return  true;
                   }else if(findroot(map,i-1,j)){
                       return  true;
                   }else if(findroot(map,i,j-1)){
                       return  true;
                   }else{
                       //该点是死路
                       map[i][j]=3;
                       return false;
                   }

           }else{//该点不是零，直接返回false
                   return  false;
               }
        }
    }

    public static void main(String[] args) {
       int [][]map=new int[8][7];
       int i,j;
       //迷宫上下初始化为1
       for(i=0;i<7;i++){
           map[0][i]=1;
           map[7][i]=1;
       }
       //左右初始化
        for(i=0;i<8;i++){
            map[i][0]=1;
            map[i][6]=1;
        }
        //设置障碍
        map[3][1]=map[3][2]=map[3][3]=map[5][4]=1;
        map[5][2]=map[5][3]=1;
        //打印迷宫
        for(i=0;i<8;i++){
            for(j=0;j<7;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("-------------------------");

        boolean a=findroot(map,1,1);
        System.out.println("该小球可以走出迷宫："+a);
        for(i=0;i<8;i++){
            for(j=0;j<7;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
