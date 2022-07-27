package homework5;

public class GiveLetterThread extends Thread {
    Letter letter;
    char startChar ='a',endChar = 'z';
    int sleepLength = 5000;
    public void setLetter(Letter letter) {
        this.letter = letter;
    }
    public void setSleepLength(int n){
        sleepLength = n;
    }
    public void run() {
        char c = startChar;
        while(true) {
            letter.setChar(c);
            System.out.printf("显示的字符:%c\n ",letter.getChar());
            try{  Thread.sleep(sleepLength); //【代码1】//调用sleep方法使得线程中断sleepLength豪秒
            }
            catch(InterruptedException e){}

            c = (char)(c+1);
            if(c>endChar)
                c = startChar;
        }
    }
}

