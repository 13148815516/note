package designPatternCode.singleton;

/**
 * 静态内部类方式，最完美，推荐食用
 * JVM保证单例，只加载一次，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Mgr07 {

    private Mgr07() {
    }

    // 静态内部类返回单例
    private static class Mgr07Holder {
        private final static Mgr07 INSTANCE = new Mgr07();
    }

    // 获取静态内部类的实例时，静态内部类才加载实例
    public static Mgr07 getInstance() {
        return Mgr07Holder.INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();
        }
    }


}
