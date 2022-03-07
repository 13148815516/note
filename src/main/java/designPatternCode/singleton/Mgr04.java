package designPatternCode.singleton;

/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可以通过synchronized解决，但也带来效率下降，不推荐
 */
public class Mgr04 {
    // 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
    private static Mgr04 INSTANCE;
    // 私有构造方法，防止被实例化
    private Mgr04() {
    }
    /* 静态工程方法，创建实例
    * 每次看有没有锁，没有就加锁
    * */
    public static synchronized Mgr04 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}
