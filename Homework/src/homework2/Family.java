package homework2;

public class Family {
    TV homeTV;
    void buyTV(TV tv) {
        homeTV=tv;
    }
    void remoteControl(int m) {
        homeTV.setChannel(m);
    }
    void seeTV() {
        homeTV.showProgram();  //homeTV调用showProgram()方法
    }
}
