package homework4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class PassWordTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String in=sc.nextLine();
        String regex="[a-zA-Z]\\w{5,17}";//以字母开头，长度在6~18之间，只能包含字符、数字和下划线"[a-zA-Z]\\w{5,17}";
        Pattern pattern= Pattern.compile(regex);
        while(!in.equals("end"))
        {
            Matcher matcher =pattern.matcher(in);
            boolean result =matcher.find();//匹配输入
            if(result == true)
            {
                System.out.println("密码格式正确！");
                in=sc.nextLine();
            }
            else
            {
                System.out.println("密码格式不正确，正确格式为：以字母开头，长度在6~18之间，只能包含字符、数字和下划线。");
                in=sc.nextLine();
            }
        }
    }
}
