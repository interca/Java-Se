package homework2;

public class MainClass {

        public static void main(String args[]) {
            TV haierTV = new TV();
        //haierTV调用setChannel(int m),并向参数m传递5
            haierTV.setChannel(5);
            System.out.println("haierTV的频道是"+haierTV.getChannel());

            Family zhangSanFamily = new Family();
           //zhangSanFamily调用void buyTV(TV tv)方法,并将haierTV传递给参数TV
            zhangSanFamily.buyTV(haierTV);
            System.out.println("zhangSanFamily开始看电视节目");
            zhangSanFamily.seeTV();

            int m=2;
            System.out.println("hangSanFamily将电视更换到"+m+"频道");
            zhangSanFamily.remoteControl(m);
            System.out.println("haierTV的频道是"+haierTV.getChannel());
            System.out.println("hangSanFamily再看电视节目");
            zhangSanFamily.seeTV();
        }
    }


