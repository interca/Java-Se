package generic2;

import java.util.List;

public class DAOtest {
    public static void main(String[] args) {
        DAO<User> p=new DAO<>();
        p.save("10001",new User(20,3,"黄裕甲"));
        p.save("10002",new User(2,32,"裕甲"));
        p.save("10006",new User(21,1,"啊甲"));
        p.save("10003",new User(21,14,"黄甲"));

        List<User> lis=p.list();
        for(User a:lis){
            System.out.println(a);
        }

    }
}
