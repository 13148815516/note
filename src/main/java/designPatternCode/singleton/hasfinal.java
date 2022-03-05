package designPatternCode.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


/**
 * 1.我先用反射调用单例类的构造函数，创建出新的单例对象来。
 * 2.使用field去访问到原本的单例对象。
 * 3.使用set方法把新创建的单例对象赋值给原本的对象。
 * 4.查看是否能赋值成功。
 *
 */
public class hasfinal {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        System.out.println("第一次拿到单例模式创建的对象: " + Mgr01.getInstance());

        Class<Mgr01> clazz = Mgr01.class;
        Constructor<Mgr01> c0 = clazz.getDeclaredConstructor();
        c0.setAccessible(true);
        Mgr01 po = c0.newInstance();
        System.out.println("反射创建出来的对象: " + po);

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Mgr01 Mgr011 = (Mgr01) field.get(Mgr01.getInstance());
            System.out.println("拿到单例模式创建的对象: " + Mgr011);
            field.set(Mgr01.getInstance(), po); //把反射创建出来的对象赋值给单例对象
            System.out.println("第二次拿到单例模式创建的对象: " + Mgr01.getInstance());
        }
    }

}
