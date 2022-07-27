package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack3 {
    public static void main(String[] args) {
        Stack<Integer>p=new Stack<>();
        p.add(1);
        p.add(2);
        p.add(3);
        for(int k:p){
            System.out.println(k);
        }
        Queue<Integer>p2=new LinkedList<>();
        p2.add(1);
        p2.add(2);
        p2.add(3);
        for (int k:p2){
            System.out.println(k);
        }
        System.out.println(p2.peek());
        System.out.println(p2.poll());
        System.out.println(p2);
    }
}
