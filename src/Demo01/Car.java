package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-07 09:23
 */
class Car extends Vehicle {
    public double carHeight; //车辆的高度

    public void run() {
        System.out.println("启动快，跑起来嗖嗖的");
    }

    public static void main(String[] args) {
        Car car = new Car();

        //可以正常调用父类对象中public方法
        car.launch();
        //这里代码将会报错 ，父类的私有方法子类无法调用
       // car.flameout();

    }

}