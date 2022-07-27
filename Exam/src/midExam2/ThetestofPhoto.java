package midExam2;

import java.util.Scanner;

public class ThetestofPhoto {
    //测试类
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str="";
        while(true){
            System.out.println("读取图片");
            str= in.next();
            //读取到点的坐标
            int index=str.lastIndexOf('.');
            if(index==-1){
                System.out.println("图片格式错误");
                continue;
            }
            //读取格式
            String num=str.substring(index+1);
            SavePhoto savePhoto;
            switch (num){
                case "gif":
                    savePhoto=new gif();
                    break;
                case "jpeg":
                    savePhoto=new jpeg();
                    break;
                case "png":
                    savePhoto=new png();
                    break;
                default:
                    System.out.println("图片格式错误");
                    continue;
            }
            savePhoto.save();
        }
    }
}
