package Demo02;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-07 09:55
 */
public class Parent {
    //静态变量
    public  static String p_staticfiend = "父类-静态变量";
    protected  int i = 1;
    protected  int j = 8;
    //变量
    public  String p_Field = "父类-变量";

    // 静态 初始化代码块
    static {
        System.out.println("父类-静态初始代码块");
        System.out.println(p_staticfiend);
    }
    //普通代码块
    {
        System.out.println("父类-初始化块");
        System.out.println(p_Field);
    }
    public Parent(){
        System.out.println("父类-构造方法");
        System.out.println("i=" + i + ",j=" +j);
        j = 9;
    }
}
