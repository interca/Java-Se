package likou2;

public class week {

    public static void main(String[] args) {
        String s= "bacabab";
        int n=s.length();
        int left=0;
        int right=0;
        //中心扩散原则,两边比较
        int l;
        int r;
        int l2;
        int r2;
        int max=1;
        for(int i=0;i<n;i++){
            l=r=i;
            while(l>=0&&r<n&&s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            l2=i;
            r2=i+1;
            while(l2>=0&&r2<n&&s.charAt(l2)==s.charAt(r2)){
                l2--;
                r2++;
            }
            if(Math.max(r2-l2-1,r-l-1)>max){
                if(r2-l2>r-l){
                    max=r2-l2-1;
                    left=l2;
                    right=r2;
                }else {
                    max=r-l-1;
                    left=l;
                    right=r;
                }
            }
            System.out.println(left);
            System.out.println(right);
        }
        System.out.println(left+1);
        System.out.println(right);
        System.out.println(s.substring(left+1,right));
    }
}