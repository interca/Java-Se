package likou;

public class lanqiao {
    int a=1;
}
class pww extends lanqiao{
    public static void main(String[] args) {
        pww pww=new pww();
        System.out.println(pww.compare("ab#e"));
    }
    public String compare(String s){
        StringBuffer stringBuffer=new StringBuffer(s);
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='#'){
                if(i>0)stringBuffer.deleteCharAt(stringBuffer.length()-1);
            }else {
                stringBuffer.append(s.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
class emplyess{
    int id=1;
    public emplyess(int id){
        this.id=id;
    }

    @Override
    public String toString() {
        return "emplyess{" +
                "id=" + id +
                '}';
    }
}