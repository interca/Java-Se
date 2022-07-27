package likou;

import java.util.*;

public class likou4 {
    public static void main(String[] args) {
        int [][]matrix={{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}};
        List<Integer> p=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0,j=0;
        p.add(matrix[0][0]);
        matrix[0][0]=-1000;
        int count=1;
        while(true){
            if(j==0&&i-1>0&&matrix[i-1][j]!=-1000){
                i--;
            }
            else if(j+1<n&&matrix[i][j+1]!=-1000){
                j++;
            }else if(i+1<m&&matrix[i+1][j]!=-1000){
                i++;
            }else if(j-1>=0&&matrix[i][j-1]!=-1000){
                j--;
            }else if(i-1>=0&&matrix[i-1][j]!=-1000){
                i--;
            } if(count==m*n)break;
            p.add(matrix[i][j]);
            matrix[i][j]=-1000;
            count++;
        }
        System.out.println(p);
    }
}
class task{
    public static void main(String[] args) {
       int []a={60, 60, 60, 60, 60, 60, 60, 61, 61, 61, 61,
               62, 62, 62, 63, 63, 63, 63, 63, 63, 64, 64, 64,
               64, 65, 65, 65, 65, 66, 66, 66, 66, 66, 66, 66,
               66, 66, 66, 67, 67, 67, 68, 68, 68, 68, 68, 68,
               69, 69, 69};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        HashMap<Integer,Integer>p=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(p.get(a[i])==null){
                p.put(a[i],1);
            }else{
                p.put(a[i],p.get(a[i])+1);
            }
        }
        int sum=0;
        Set<Integer>p2=p.keySet();
        System.out.println(p);
        for(int k:p2){
            int impreise=0;
            out:
           for(int i =0;i<p.get(k)/2+1;i++) {
               for (int j = 0; j < p.get(k) / 3 + 1; j++) {
                   if (i * 2 + j * 3 == p.get(k)) {

                       sum = sum + i + j;
                       impreise = 1;
                       break out;
                   }
               }
           }
           if(impreise==0){
               sum=-1;
               break;
           }
        }
        System.out.println(sum);
    }
}