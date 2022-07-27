package datastructure;
//链表的主体
public class StudentInfo {
    String stuNo;//学号
     String stuName;//姓名
     String college;//学院
    String speciality;//专业
     String stuSex;//性别
     String stuPhone;//手机号
     String QQ;
     String weChat;
     StudentInfo next=null;


    public StudentInfo(String stuNo, String stuName, String college,
                       String speciality, String stuSex, String stuPhone,
                       String QQ, String weChat) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.college = college;
        this.speciality = speciality;
        this.stuSex = stuSex;
        this.stuPhone = stuPhone;
        this.QQ = QQ;
        this.weChat = weChat;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "stuNo='" + stuNo + '\'' +
                ", stuName='" + stuName + '\'' +
                ", college='" + college + '\'' +
                ", speciality='" + speciality + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuPhone='" + stuPhone + '\'' +
                ", QQ='" + QQ + '\'' +
                ", weChat='" + weChat + '\'' +
                '}';
    }
}
