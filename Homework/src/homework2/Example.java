package homework2;

public class Example {
    public static void main(String args[]) {
        ChinaPeolple chinaPeople=new ChinaPeolple();
        AmericanPeople americanPeople=new AmericanPeople();
        BeijingPeolple beijingPeople=new BeijingPeolple();

        chinaPeople.speakHello();
        americanPeople.speakHello();
        beijingPeople.speakHello();

        chinaPeople.averageHeight();
        americanPeople.averageHeight();
        beijingPeople.averageHeight();

        chinaPeople.averageWeight();
        americanPeople.averageWeight();
        beijingPeople.averageWeight();

        chinaPeople.chinaGongfu();
        americanPeople.americanBoxing();
        beijingPeople.beijingOpera() ;
        beijingPeople.chinaGongfu();
    }
}
