package designPatternCode.strategy;

import java.util.Arrays;

/**
 * 比较大小
 * extreme programming
 *  1.一开始单独用排序对int，double，fload等类型的数据排序（随便选择一种排序方式）
 *  2.后来对猫，狗某个参数排序
 *  3.后来引入策略，对猫狗的所有属性进行排序，开闭原则
 */
public class Main {
    public static void main(String[] args) {
//        //int[] a = {9, 2, 3, 5, 7, 1, 4};
//        Cat[] a = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};
//        //Dog[] a = {new Dog(3), new Dog(5), new Dog(1)};
//        // 对int，cat，double类型排序
//        Sorter<Cat> sorter = new Sorter<>();
//        sorter.sort(a, (o1, o2)->{
//            if(o1.weight < o2.weight) return -1;
//            else if (o1.weight>o2.weight) return 1;
//            else return 0;
//        });
//        System.out.println(Arrays.toString(a));



        // 1.一开始单独用Sorter对int，double，fload等类型的数据排序
        int[] a = {9, 2, 3, 5, 7, 1, 4};
        Sorter1 sorter1 = new Sorter1();
        sorter1.sort(a);
        System.out.println(Arrays.toString(a));
    }



}
