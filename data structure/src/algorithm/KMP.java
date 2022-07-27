package algorithm;

public class KMP {
    //KMP算法求最短子序列
    public static void main(String[] args) {
       char[]a={'A','B','A','B','C','A','B','A','A'};
       int []b=new int[a.length];
       creatprefix(a,b);
       //将前缀表往后面移动，然后再把第一个用-1填充`
        remove(b);
        char []text={'A','B','A','B','A','B','A','B','C','A','B','A','A','B'};
        Kmp(a,text,b);
    }
    public static void Kmp(char []patter,char[]text,int []prefixe){
        int m=text.length;
        int n=patter.length;
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if(j==n-1&&patter[j]==text[i]){
                System.out.println("找到"+(i-j));
                return ;
            }
            if(patter[j]==text[i]){
                i++;
                j++;
            }else {
               j= prefixe[j];
               if(j==-1){
                   i++;
                   j++;
               }
            }
        }
        System.out.println("没有找到");
    }
    //形成前缀表
    public static void creatprefix(char []pattern,int []prefix){
         prefix[0]=0;
         //比较长度
         var len=0;
         int i=1;
         while(i<pattern.length){
             //如果相等，就加一
             if(pattern[len]==pattern[i]){
                 len++;
                 prefix[i]=len;
                 i++;
             }else {
                 if(len>0)
                len=prefix[len-1];
                 else{
                     prefix[i]=len;
                     i++;
                 }
             }
         }
    }
    //移动前缀表
    public static void remove(int []prefix){
        int i=prefix.length-1;
        for(;i>0;i--){
            prefix[i]=prefix[i-1];
        }
        prefix[0]=-1;
    }
}
