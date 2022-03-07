package designPatternCode.Mgr08;

/**
 * 不仅可以解决线程同步，还可以防止反序列化。
 */
public enum Mgr08 {

    INSTANCE;

    public void m() {}

    private String objName;

    public String getObjName() {
        return objName;
    }


    public void setObjName(String objName) {
        this.objName = objName;
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }

    public static void main1(String[] args) {

        // 单例测试
        Mgr08 firstMgr08 = Mgr08.INSTANCE;
        firstMgr08.setObjName("firstName");
        System.out.println(firstMgr08.getObjName());
        Mgr08 secondMgr08 = Mgr08.INSTANCE;
        secondMgr08.setObjName("secondName");
        System.out.println(firstMgr08.getObjName());
        System.out.println(secondMgr08.getObjName());

        // 反射获取实例测试
        try {
            Mgr08[] enumConstants = Mgr08.class.getEnumConstants();
            for (Mgr08 enumConstant : enumConstants) {
                System.out.println(enumConstant.getObjName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
