package designPatternCode.singleton;

/**
 * lazy loading 双层判断单例写法，完美之一，但没必要，不推荐
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可以通过synchronized解决，但也带来效率下降
 * 同步代码块里再判断是否为空
 */
public class Mgr06 {
    // 加volatile，防止指令重拍问题，可能在实例前初始化
    private static volatile Mgr06 INSTANCE; //JIT

    private Mgr06() {
    }

    public static Mgr06 getInstance() {
        // 大部分走第一个判断，直接返回单例
        if (INSTANCE == null) {
            // 加同步锁的同步代码块里面再次判断
            // 双重检查
            synchronized (Mgr06.class) {
                // 第一次多个线程时判断
                if(INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }
}
