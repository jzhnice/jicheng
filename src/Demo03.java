/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-07 10:18
 */
public class Demo03 {
    //定义动物叫的方法
    public void shout(){
        System.out.println("动物发出叫声");
    }
}
class Dog extends  Demo03{
    //定义狗是怎末叫的
    @Override
    public void shout(){
        System.out.println("汪汪汪");
    }
}
//测试
class Sample{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
    }
}