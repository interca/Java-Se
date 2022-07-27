package weiming;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入老师信息");
        Teacher teacher=new Teacher(in.nextInt(),in.next(), in.next(), in.next(), in.next(), in.next());
        System.out.println(teacher);
        System.out.println("输入学生信息");
        Student student=new Student(in.nextInt(),in.next(), in.next(), in.next(), in.next(), in.next());
        System.out.println(student);
    }
}
