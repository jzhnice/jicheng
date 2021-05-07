package Demo02;

import javax.print.DocFlavor;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-07 09:55
 */
public class SubClass  extends Parent {
    //静态变量
    public static  String s_staticField = "子类-静态变量";
    //变量
    public String s_Field = "子类-变量";
    //静态 初始化代码块
    static {
        System.out.println("子类-静态初始化块");
        System.out.println(s_staticField);
    }
    //普通代码块
    {
        System.out.println("子类-初始化块");
        System.out.println(s_Field);
    }
    public SubClass(){
        System.out.println("子类-构造方法");
        System.out.println("i="+ i+",j=" +j);
    }

    public static void main(String[] args) {
        new SubClass();
    }
}
