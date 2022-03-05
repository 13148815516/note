package designPatternCode.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


/**
 * 1.�����÷�����õ�����Ĺ��캯�����������µĵ�����������
 * 2.ʹ��fieldȥ���ʵ�ԭ���ĵ�������
 * 3.ʹ��set�������´����ĵ�������ֵ��ԭ���Ķ���
 * 4.�鿴�Ƿ��ܸ�ֵ�ɹ���
 *
 */
public class Nofinal {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        System.out.println("��һ���õ�����ģʽ�����Ķ���: " + Mgr01_1.getInstance());

        Class<Mgr01_1> clazz = Mgr01_1.class;
        Constructor<Mgr01_1> c0 = clazz.getDeclaredConstructor();
        c0.setAccessible(true);
        Mgr01_1 po = c0.newInstance();
        System.out.println("���䴴�������Ķ���: " + po);

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Mgr01_1 Mgr01_11 = (Mgr01_1) field.get(Mgr01_1.getInstance());
            System.out.println("�õ�����ģʽ�����Ķ���: " + Mgr01_11);
            field.set(Mgr01_1.getInstance(), po); //�ѷ��䴴�������Ķ���ֵ����������
            System.out.println("�ڶ����õ�����ģʽ�����Ķ���: " + Mgr01_1.getInstance());
        }
    }

}
