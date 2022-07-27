package objectstream;

import java.io.*;

//对象流
public class objectstream1 {
    public static void main(String[] args)  {
        ObjectOutputStream fre= null;
        try {
            fre = new ObjectOutputStream(new FileOutputStream("iofile\\Object.dat"));
            fre.writeObject(new String("我喜欢你"));
            fre.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fre!=null)
                fre.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

            ObjectInputStream fre2=null;
        try {
             fre2=new ObjectInputStream(new FileInputStream("iofile\\Object.dat"));
            Object obj=fre2.readObject();
            String a=(String) obj;
            System.out.println(a);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fre2!=null)
                    fre2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
