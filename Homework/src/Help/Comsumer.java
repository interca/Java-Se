package Help;

import java.util.Iterator;
import java.util.LinkedList;

public class Comsumer implements Runnable {

    private  final LinkedList<Integer> list;
    private final LinkedList<Integer> num = new LinkedList<Integer>();
    private boolean panduan = false;
    private int[] a = new int[10];
    private int s = 0;

    public void getNum() {
        System.out.println(num);
        Iterator<Integer> te = num.iterator();
        while (te.hasNext()) {
            System.out.println(te.next() + " ");
        }
    }

    public  Comsumer(LinkedList<Integer> list) {
        this.list = list;
    }

    public boolean panduan(int n) {
        for (int i = 0; i < s; i++) {
            if (a[i] == n) {
                panduan = true;
                break;
            }
        }
        return panduan;
    }

    public void run() {
        while (true) {
            try {
                synchronized (list) {
                    Thread.sleep(2000);
                    if (list.isEmpty()) {

                        list.wait();
                    } else {
                        consume(list.poll());
                        list.notifyAll();
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void consume(Integer n) {
        a[s] = n;
        s++;
        num.add(n);
    }
}



