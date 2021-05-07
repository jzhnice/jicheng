package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-07 09:23
 */
public class Vehicle {
    public int wheeINum; //车轮数量

    // 注意这个方法是私有的
    private void flameout() {
        System.out.println("车辆熄火");
    }

    public void launch() {
        System.out.println("启动车辆");
    }


}