package generic2;

import java.util.*;

public class DAO <T>{
    private Map<String,T> map=new HashMap<>();
    //保存T类型到MAP
    public void save(String id,T entity){
        map.put(id,entity);
    }
    //获取id对应的对象
    public T get(int id){
        return map.get(id);
    }
    //替换内容
    public void update(String id,T entity){
        if(map.containsKey(id)){
            map.put(id,entity);
        }
    }
    //返回MAP中所有分VALUES
    public List<T>list(){
        Collection<T> value=map.values();
        List<T> p=new ArrayList<>();
        Iterator<T> inter=value.iterator();
        while(inter.hasNext()){
            p.add(inter.next());
        }
        return p;
    }
    //删除
    public  void reomve(String id){
        map.remove(id);
    }

}
