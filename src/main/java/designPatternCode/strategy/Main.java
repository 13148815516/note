package designPatternCode.strategy;

import java.util.Arrays;

/**
 * �Ƚϴ�С
 * extreme programming
 *  1.һ��ʼ�����������int��double��fload�����͵������������ѡ��һ������ʽ��
 *  2.������è����ĳ����������
 *  3.����������ԣ���è�����������Խ������򣬿���ԭ��
 */
public class Main {
    public static void main(String[] args) {
//        //int[] a = {9, 2, 3, 5, 7, 1, 4};
//        Cat[] a = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};
//        //Dog[] a = {new Dog(3), new Dog(5), new Dog(1)};
//        // ��int��cat��double��������
//        Sorter<Cat> sorter = new Sorter<>();
//        sorter.sort(a, (o1, o2)->{
//            if(o1.weight < o2.weight) return -1;
//            else if (o1.weight>o2.weight) return 1;
//            else return 0;
//        });
//        System.out.println(Arrays.toString(a));



        // 1.һ��ʼ������Sorter��int��double��fload�����͵���������
        int[] a = {9, 2, 3, 5, 7, 1, 4};
        Sorter1 sorter1 = new Sorter1();
        sorter1.sort(a);
        System.out.println(Arrays.toString(a));
    }



}
