package weiming;


public class Heroo {
        private String name; // 姓名

        float hp; // 血量

        float armor; // 护甲

        int moveSpeed; // 移动速度

        // 非静态内部类，只有一个外部类对象存在的时候，才有意义
        // 战斗成绩只有在一个英雄对象存在的时候才有意义
        class BattleScore {
            int kill;
            int die;
            int assit;

            public void legendary() {
                if (kill >= 8)
                    System.out.println(name + "超神！");
                else
                    System.out.println(name + "尚未超神！");
            }
        }

        public static void main(String[] args) {
            Heroo garen = new Heroo();
            garen.name ="galun";
            // 实例化内部类
            // BattleScore对象只有在一个英雄对象存在的时候才有意义
            // 所以其实例化必须建立在一个外部类对象的基础之上
           Heroo.BattleScore score = garen.new BattleScore();
            score.kill = 9;
            score.legendary();
        }


    }

