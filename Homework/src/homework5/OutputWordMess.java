package homework5;

import java.util.*;
public class OutputWordMess{
    public static void main(String args[]) {
        Vector<String> allWord,noSameWord;
        WordStatistic statistic =new WordStatistic();
        statistic.setFileName("C:\\Users\\waili\\Desktop\\Java code of idea\\Homework\\src\\homework5\\english");
        statistic .wordStatistic(); ////statistic调用wordStatistic()方法
                allWord=statistic.getAllWord();
        noSameWord=statistic.getNoSameWord();
        System.out.println("共有"+allWord.size()+"个英文单词");
        System.out.println("有"+noSameWord.size()+"个互不相同英文单词");
        System.out.println("按出现频率排列:");
        int count[]=new int[noSameWord.size()];
        for(int i=0;i<noSameWord.size();i++) {
            String s1 = noSameWord.elementAt(i);
            for(int j=0;j<allWord.size();j++) {
                String s2=allWord.elementAt(j);
                if(s1.equals(s2))
                    count[i]++;
            }
        }
        for(int m=0;m<noSameWord.size();m++) {
            for(int n=m+1;n<noSameWord.size();n++) {
                if(count[n]>count[m]) {
                    String temp=noSameWord.elementAt(m);
                    noSameWord.setElementAt(noSameWord.elementAt(n),m);
                    noSameWord.setElementAt(temp,n);
                    int t=count[m];
                    count[m]=count[n];
                    count[n]=t;
                }
            }
        }
        for(int m=0;m<noSameWord.size();m++) {
            double frequency=(1.0*count[m])/allWord.size();
            System.out.printf("%s:%-7.3f",noSameWord.elementAt(m),frequency);
        }
    }
}
