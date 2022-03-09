---  
title: �����ʼ�  
category: ϵͳ���   
tag:  
  - ���ģʽ
    - ������
---

����ģʽ�漰��һ����һ���࣬���ฺ�𴴽��Լ��Ķ���ͬʱȷ��ֻ�е������󱻴�����������ṩ��һ�ַ�����Ψһ�Ķ���ķ�ʽ������ֱ�ӷ��ʣ�����Ҫʵ��������Ķ���
### �ô�
1��ĳЩ�ഴ���Ƚ�Ƶ��������һЩ���͵Ķ�������һ�ʺܴ��ϵͳ������
2��ʡȥ��new��������������ϵͳ�ڴ��ʹ��Ƶ�ʣ�����GCѹ����
3����Щ���罻�����ĺ��Ľ������棬�����Ž������̣����������Դ�������Ļ���ϵͳ��ȫ���ˡ�������һ�����ӳ����˶��˾��Աͬʱָ�ӣ��϶����ҳ�һ�ţ�������ֻ��ʹ�õ���ģʽ�����ܱ�֤���Ľ��׷��������������������̡�


### �ص�
- 1��ֻ����һ��ʵ����
- 2�������Լ������Լ���Ψһʵ����
- 3��������������������ṩ��һʵ����

## ���������ʵ��
### ��ṹ
- ʹ��һ��˽�й��캯����һ��˽�о�̬�����Լ�һ�����о�̬������ʵ�֡�  
![�����ṹͼ](./images/singletonStructureDiagram.png)

### ���ʵ��
- ˽�й��캯����֤�˲���ͨ�����캯������������ʵ����ֻ��ͨ�����о�̬��������Ψһ��˽�о�̬������
---
## ʵ�ַ���

- [����ʽ](/src/main/java/designPatternCode/singleton/Mgr01.java)
```java
private final static Singleton uniqueInstance = new Singleton();
```
   - �ŵ㣺�̰߳�ȫ
   - ȱ�㣺�����õ������װ��ʱ�����ʵ����
   - �ؼ���
     - ˽�л����췽��
     - ������̬����
     - static final�ô���ʵ��
- [����ʽ](/src/main/java/designPatternCode/singleton/Mgr03.java)
```java
if (INSTANCE == null) {INSTANCE = new Mgr03();}
```
   - �ŵ㣺�ӳټ��أ��õ�ʱ�ż���
   - ȱ�㣺�̲߳���ȫ
   - �ؼ���
     - ˽�л����췽��
     - ������̬����
     - ʵ����Ϊ�վʹ���ʵ��
     
- [����ʽ-�̰߳�ȫ](/src/main/java/designPatternCode/singleton/Mgr04.java)
  - �ؼ�������ʽ�����ϣ���getInstance��synchronized�ؼ���
  - �ŵ㣺����̰߳�ȫ��
  - ȱ�㣺�����������У�������ʳ��    
ע���߳����ⷢ������  
1.���̵߳Ļ�����  
2.�����й�����Դ  
3.����Դ���з�ԭ���Բ���  

- [����ʽ-˫���ж�](/src/main/java/designPatternCode/singleton/Mgr06.java)
  - �ؼ�������ʽ�����ϣ����漰���̵߳�ͬ��������synchronized�ؼ��֣��ҿ����ٴ��ж�
  - �ŵ㣺����̰߳�ȫ��
  - ȱ�㣺д�����ӣ���Ҫͬ����������ⶼ�жϣ�������ʳ��    

- [����ʽ-��̬�ڲ��෽ʽ](/src/main/java/designPatternCode/singleton/Mgr07.java)
  - �ؼ����� Singleton �౻����ʱ����̬�ڲ��� SingletonHolder û�б����ؽ��ڴ档  
        ֻ�е����� `getUniqueInstance()` �����Ӷ����� `SingletonHolder.INSTANCE` ʱ SingletonHolder �Żᱻ���أ���ʱ��ʼ�� INSTANCE ʵ����  
        ���� JVM ��ȷ�� INSTANCE ֻ��ʵ����һ��  
  - �ŵ㣺�����أ��̰߳�ȫ
  - ȱ�㣺�����캯���ڳ����򲻻����ʵ��
  
- [����ʽ-ö��](/src/main/java/designPatternCode/singleton/Mgr08.java)
  - �ؼ����� Singleton �౻����ʱ����̬�ڲ��� SingletonHolder û�б����ؽ��ڴ档  
        ֻ�е����� `getUniqueInstance()` �����Ӷ����� `SingletonHolder.INSTANCE` ʱ SingletonHolder �Żᱻ���أ���ʱ��ʼ�� INSTANCE ʵ����  
        ���� JVM ��ȷ�� INSTANCE ֻ��ʵ����һ��  
  - �ŵ㣺�����أ��̰߳�ȫ����ֹ�����л���effective java�Ƽ���ʽ
  - ȱ�㣺��
  
- �����г��÷�����
  - ʹ��spring��bean������������