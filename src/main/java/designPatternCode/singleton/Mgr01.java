package designPatternCode.singleton;

/**
 * 饿汉式
 *
 *
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐食用！
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 *
 *
 */
public class Mgr01 {
    // 加final关键字，运行时被初始化，可以直接赋值，也可以在实例构造器中赋值，赋值后不可修改，性能较差
    // static：唯一的不变的，共享内存，
    // 静态变量 ：jvm把class加载内存后初始化，提前初始化
    // static final 编译期即把结果放入了常量池
    private static final Mgr01 INSTANCE = new Mgr01();

    // 私有化构造方法，保证类的外部无法实例化对象
    private Mgr01() {};
    // 调公共静态方法：就返回唯一的实例，原子性，线程安全
    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);
    }
}
