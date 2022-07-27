package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class keyvalue {
    public static void main(String[] args) {
        HashMap<String,Integer>hash=new HashMap<>();
        hash.put("你好",1);
        hash.put("你",2);
        hash.put("好",3);
        hash.put("换裕甲",4);
        Set <Map.Entry<String,Integer>>set=hash.entrySet();
       Iterator<Map.Entry<String,Integer>> integer=set.iterator();
       while(integer.hasNext()){
           Map.Entry p=integer.next();
           System.out.println("key="+p.getKey()+",value="+p.getValue());
       }
        System.out.println("-------------------------");
       for(Map.Entry p:set){
           System.out.println("key="+p.getKey()+",value="+p.getValue());
       }
    }
}
