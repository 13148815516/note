package designPatternCode.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用！
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 * Class.forName("")
 * （话说你不用的，你装载它干啥）
 */
public class Mgr01_1 {
    // 类加载时就实例化，加final关键字
    private static Mgr01_1 INSTANCE = new Mgr01_1();

    // 其他类new不了Mgr01，只能调getInstance获取
    private Mgr01_1() {};

    public static Mgr01_1 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr01_1 m1 = Mgr01_1.getInstance();
        Mgr01_1 m2 = Mgr01_1.getInstance();
        System.out.println(m1 == m2);
    }
}
