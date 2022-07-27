package datastructure;

public class List1 {
    public static void main(String[] args) {

        int[][] map = new int[8][8];
        for (int i = 0; i < 8; i++) {
            map[i][0] = map[i][7] = 1;
        }
        for (int i = 0; i < 8; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        map[4][0] = map[4][1] = map[4][2] = map[4][3] = 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(dfs(map, 1, 1));
        //回溯后的迷宫
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static boolean dfs(int[][]map,int i,int j){
        if(map[map.length-2][map[0].length-2]==2){
            return true;
        }
        else {
            if(map[i][j]==0){
                map[i][j]=2;
                if(dfs(map,i,j+1)==true)return true;
                else if(dfs(map,i+1,j)==true)return true;
                else if(dfs(map,i-1,j)==true)return true;
                else if((dfs(map,i,j-1))==true)return true;
                else {
                    map[i][j]=3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }

}