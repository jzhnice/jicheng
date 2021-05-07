package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-07 09:23
 */
 class Sedan  extends  Car{
     public void manned(){
         System.out.println("可载人");
     }

    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        // car 继承了Vehicle,Sedan 有继承Car,
        // 也可以使用Vehicle 中的方法，这个就是多层继承
        sedan.launch();
    }
}
