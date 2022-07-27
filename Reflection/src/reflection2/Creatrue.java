package reflection2;

import java.io.Serializable;

public class Creatrue<T>implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("breath");
    }
    private void eat(){
        System.out.println("animal eat something");
    }

}
