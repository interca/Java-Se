package firsthomework;

public class test4 {
    public static void main(String[] args) {
        int left=10;
        int right=15;
        int count;
        int imprise;
        int sum=0;
        for(int i=left;i<=right;i++){
            imprise=1;
            count=1;
            int x=i;
            while(x>1){
                if(x%2==1)count++;
                x=x/2;
            }
            System.out.println(count);
            for(int j=2;j<count;j++){
                if(count%j==0){
                    System.out.println(count);
                    imprise=0;
                    break;
                }
            }
            if(count==1)imprise=0;
            if(imprise==1)sum=sum+1;
        }
        System.out.println(sum);
    }
}
