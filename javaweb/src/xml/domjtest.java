package xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.testng.annotations.Test;

import java.util.List;

public class domjtest {
    //解析xml
    @Test
    public void test1() throws DocumentException {
        //创建一个输入流,d读xml文件，生成document对象
        SAXReader saxReader=new SAXReader();
       Document document= saxReader.read("C:\\Users\\waili\\Desktop\\Java code of idea\\javaweb\\src\\xml\\book.xml");
        System.out.println(document);
    }
    //读取xml文件生成book类
    @Test
    public void test2() throws DocumentException {
      //读取book.xml文件   通过document对象获取根元素  通过根元素获取book标签对象
        //遍历
        SAXReader saxReader=new SAXReader();
        Document document=saxReader.read("C:\\Users\\waili\\Desktop\\Java code of idea\\javaweb\\src\\xml\\book.xml");
        Element element=document.getRootElement();
        List<Element> book=element.elements("book");
        for(Element b:book){
            //xml把标签对象转换为字符串
            //System.out.println(b.asXML());
            //打印标签name
            Element booktext=b.element("name");
            //获取文本内容
            String nametest=booktext.getText();
            String pricetext=b.elementText("price");
            String authortext=b.elementText("author");
            String snvalue=b.attributeValue("sn");
            System.out.println(new book(snvalue,nametest,Double.parseDouble(pricetext),authortext));
        }
    }
}
