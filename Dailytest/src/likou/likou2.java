package likou;

public class likou2 {
    public static void main(String[] args) {
        System.out.println(Math.random()*1000);
    }
}


class test111 {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;

        int[][] relation = {{0, 2}, {2, 1}, {3, 4}, {2, 3}, {1, 4}, {2, 0}, {0, 4}};
        int[] a = new int[2];
        a[1] = 0;
        int count=0;
        dfs(relation, a, k, n, 0,0,0);
        System.out.println(a[0]);
    }


    public static void dfs(int[][] relation, int[] a, int k, int n,int w1, int w,int count) {
        count++;
        System.out.println(w+" "+count);
        if (w == n-1 && count==k+1) {
            System.out.println("mihao");
            a[0] = a[0] + 1;
            a[1] = 0;
        }
         if(count>k+1)return;
        else {

            for (int i = 0; i < relation.length; i++) {

                    if (relation[i][0] == w) {
                        System.out.println("relation[i][0]="+relation[i][0]+"relation[i][1]="+relation[i][1]);
                        dfs(relation, a, k, n, relation[i][0],relation[i][1],count);
                    }


            }
        }
    }
}
class liko222{
    public static void main(String[] args) {
        String s="abab";
        int n=s.length();
        String str="";
        boolean flag=true;
        for(int i=1;i<=n/2;i++){
            flag=true;
            str=s.substring(0,i);
            System.out.println(str);
            for(int j=i;j<n;j=j+i){
                System.out.println(s.substring(j,j+i));
                if(str.equals(s.substring(j,j+i))==false){
                    flag=false;
                    break;
                }
            }
            if(flag==true) System.out.println("找到了");
        }

    }
}