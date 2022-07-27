package firsthomework;
//力扣调试
public class test3 {
    public static void main(String[] args) {
        String current="02:30";
        String correct="04:35";
        int sum1=0;
        int sum2=0;
        int index=10;
        for(int i=0;i<2;i++){
            sum1=sum1+(current.charAt(i)-'0')*index;
            sum2=sum2+(correct.charAt(i)-'0')*index;
            index=index/10;
        }
        sum1=sum1*60;
        sum2=sum2*60;
        index=10;
        for(int i=3;i<5;i++){
            sum1=sum1+(current.charAt(i)-'0')*index;
            sum2=sum2+(correct.charAt(i)-'0')*index;

            index=index/10;
        }
        int max;

        max= Math.abs((sum1-sum2));
        System.out.println(max);
        int counthh=max/60;
        System.out.println(counthh);
        int sumhh=max%60;
        System.out.println(sumhh);
        for(int j=0;j<=sumhh/15;j++){
            for(int k=0;k<=sumhh/5;k++){
                for(int w=0;w<=sumhh;w++){
                    if((j*15+k*5+w)==sumhh){
                        counthh=counthh+j+k+w;
                        break;
                    }
                }
            }
        }

        System.out.println(counthh);
    }
}
