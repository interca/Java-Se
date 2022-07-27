package homework6;

public class Student implements Comparable  {
    String name;
    int score;
    Student(String name,int score) {
        this.name=name;
        this.score=score;
    }
    public int compareTo(Object b) {
        Student st=(Student)b;
        int m=this.score-st.score;
        if(m!=0)
            return m;
        else
            return 1;
    }
    public int getScore() {
        return score;
    }
    public String getName() {
        return name;
    }
}

