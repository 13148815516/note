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
public class hasfinal {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        System.out.println("��һ���õ�����ģʽ�����Ķ���: " + Mgr01.getInstance());

        Class<Mgr01> clazz = Mgr01.class;
        Constructor<Mgr01> c0 = clazz.getDeclaredConstructor();
        c0.setAccessible(true);
        Mgr01 po = c0.newInstance();
        System.out.println("���䴴�������Ķ���: " + po);

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Mgr01 Mgr011 = (Mgr01) field.get(Mgr01.getInstance());
            System.out.println("�õ�����ģʽ�����Ķ���: " + Mgr011);
            field.set(Mgr01.getInstance(), po); //�ѷ��䴴�������Ķ���ֵ����������
            System.out.println("�ڶ����õ�����ģʽ�����Ķ���: " + Mgr01.getInstance());
        }
    }

}
