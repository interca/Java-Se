package xmc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int n=101;
        if(n==Math.pow(2,31)-1) System.out.println(-1);
        List<Character> list=new ArrayList<>();
        String s=n+"";
        int n1=s.length();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        int []vist=new int[n1];
        int i;
        int flag=1;
        Collections.sort(list);
        int j=0;
        System.out.println(list);
        for(i=0;i<n1;i++){
            char a=s.charAt(i);
            for(j=0;j<list.size();j++){
                if(list.get(j)>a&&vist[j]==0){
                    flag=0;
                    break;
                }
                if(vist[j]==0&&list.get(j)==a&&(j+1==n1||list.get(j+1)==list.get(j))){
                    vist[j]=1;
                    break;
                }
            }
            if(flag==0)break;
        }
        System.out.println("i="+i);
        System.out.println("j="+j);
        if(flag==1) System.out.println(-1);
        else {
            String str = s.substring(0, i);
            str = str + s.charAt(j);
            vist[j]=1;
            System.out.println(str);
            for (i = 0; i < list.size(); i++) {
                if (vist[i] == 0) str = str + list.get(i);
            }
            System.out.println(Integer.parseInt(str));
        }
    }


}
