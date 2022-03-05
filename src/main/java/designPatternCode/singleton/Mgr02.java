package designPatternCode.singleton;

/**
 * 跟01是一个意思，初始化方式不一样
 */
public class Mgr02 {
    private static final Mgr02 INSTANCE;
    // 静态初始化块 进行初始化，其他一样
    static {
        INSTANCE = new Mgr02();
    }

    private Mgr02() {};

    public static Mgr02 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr02 m1 = Mgr02.getInstance();
        Mgr02 m2 = Mgr02.getInstance();
        System.out.println(m1 == m2);
    }
}
