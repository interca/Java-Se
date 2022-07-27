package oj;

import java.util.*;

public class oj3 {
    static int min=1000000*30;
    public static void main(String[] args) {
        //回溯问题
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [][]num=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                num[i][j]=(int)(Math.random()*20);
            }
        }
        int []vist;
        for(int i=0;i<=0;i++){
            vist=new int[n];
            vist[i]=1;
            ////System.out.println(i+"起点");
            dfs(num,vist,i,0,0);
        }
        System.out.println(min);
    }
    public static void dfs(int [][]num,int []vist,int i,int n,int sum){
        if(sum>min)return;
        //System.out.println(i);
        if(n==vist.length-2){
            int a=sum+num[i][vist.length-1];
           // System.out.println(a+"-----");
            min=Math.min(a,min);
            return;
        }
        for(int j=1;j<vist.length-1;j++){
            if(vist[j]==0&&i!=j){
                vist[j]=1;
                if(sum+num[i][j]>min)return;
                dfs(num,vist,j,n+1,sum+num[i][j]);
                vist[j]=0;
            }
        }
    }
}
class ssss{
    public static void main(String[] args) {
        System.out.println("ee".compareTo("ffffff"));
    }
    public  static int equalPairs(int[][] grid) {
       int n=grid.length;
       int sum=0;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               int count=0;
               for(int w=0;w<n;w++){
                   if(grid[i][w]==grid[w][j])count++;
               }
               if(count==n)sum++;
           }
       }
       return sum;
    }
}
class FoodRatings {
    HashMap<String,count>map1=new HashMap<>();///对象名加类
    HashMap<String, TreeSet<count>>map2=new HashMap<>();//烹饪方式加类
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for(int i=0;i<foods.length;i++){
            String s=foods[i];
            String s2=cuisines[i];
            int score=ratings[i];
            count p=new count(s,score,s2);
            map1.put(s,p);
            if(map2.get(s2)==null){
                TreeSet<count>set=new TreeSet<>();
                set.add(p);
                map2.put(s,set);
            }else {
                map2.get(s2).add(p);
            }
        }
    }

    public void changeRating(String food, int newRating) {
         count p=map1.get(food);
         String s=p.cuisinesname;
         map2.get(s).remove(p);
         p.score=newRating;
         map2.get(s).add(p);

    }

    public String highestRated(String cuisine) {
         return map2.get(cuisine).last().cuisinesname;
    }
}
class count implements Comparable<count> {
    public String foodname;
    public int score;
    public String cuisinesname;

    public count(String foodname, int score, String cuisinesname) {
        this.foodname = foodname;
        this.score = score;
        this.cuisinesname = cuisinesname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCuisinesname(String cuisinesname) {
        this.cuisinesname = cuisinesname;
    }

    public String getFoodname() {
        return foodname;
    }

    public int getScore() {
        return score;
    }

    public String getCuisinesname() {
        return cuisinesname;
    }


    @Override
    public int compareTo(count o) {
        if(this.score!=o.score)return Integer.compare(this.score,o.score);
        return -this.foodname.compareTo(o.foodname);
    }
}


class NumberContainers {
    HashMap<Integer,Integer>map1;
    HashMap<Integer,TreeSet<Integer>>map2;
    public NumberContainers() {
        map1=new HashMap<>();
        map2=new HashMap<>();
    }
    public void change(int index, int number) {
        if(map1.get(index)==null){
            map1.put(index,number);
        }else{
            //System.out.println(map1.get(index));
            TreeSet<Integer>set=map2.get(map1.get(index));
            set.remove(index);
            map1.put(index,number);
        }
        if(map2.get(number)==null){
            TreeSet set1=new TreeSet<>();
            set1.add(index);
            map2.put(number,set1);
        }else {
            map2.get(number).add(index);
        }
    }

    public int find(int number) {
        if(map2.get(number)==null||map2.get(number).size()==0)return-1;
        return map2.get(number).first();
    }
}
class main5{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        TreeSet<stu>set=new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(new stu(in.next(),in.nextInt(), in.nextInt()));
        }
        for(stu p:set){
            System.out.println(p.name+" "+p.age+" "+p.score);
        }
    }
}
class stu implements Comparable<stu>{
    public  String name;
    public  int age;
    public  int score;

    @Override
    public int compareTo(stu o) {
        if(this.score!=o.score)return Integer.compare(this.score,o.score);
        else if(this.name.equals(o.name)==false)return this.name.compareTo(o.name);
        return Integer.compare(this.age,o.age);
    }

    public stu(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
class mian5{
    public static void main(String[] args) {
        int n = 4;
        int [][]dislikes = {{1,2},{1,3},{2,4}};
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<dislikes.length;i++){
            int k1=dislikes[i][0];
            int k2=dislikes[i][1];
            if(map.get(k1)==null){
                List<Integer>help=new ArrayList<>();
                help.add(k2);
                map.put(k1,help);
            }else map.get(k1).add(k2);
            if(map.get(k2)==null){
                List<Integer>help=new ArrayList<>();
                help.add(k1);
                map.put(k2,help);
            }else map.get(k2).add(k1);
        }

        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        for(int i=1;i<=n;i++){
            List<Integer>help=map.get(i);
            int flag1=0;
            int flag2=0;
            for(int w:help){
                if(list1.contains(w)==true)flag1=1;
                if(list2.contains(w)==true)flag2=1;
            }
            if(flag1==0)list1.add(i);
            else if(flag2==0)list2.add(i);
        }

        System.out.println(list1);
        System.out.println(list2);
    }
}