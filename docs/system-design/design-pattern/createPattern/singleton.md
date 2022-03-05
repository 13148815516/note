---  
title: 单例笔记  
category: 系统设计   
tag:  
  - 设计模式
    - 创建型
---

这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
### 好处
1、某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销。
2、省去了new操作符，降低了系统内存的使用频率，减轻GC压力。
3、有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统完全乱了。（比如一个军队出现了多个司令员同时指挥，肯定会乱成一团），所以只有使用单例模式，才能保证核心交易服务器独立控制整个流程。


### 特点
- 1、只能有一个实例。
- 2、必须自己创建自己的唯一实例。
- 3、必须给所有其他对象提供这一实例。

## 代码与设计实现
### 类结构
- 使用一个私有构造函数、一个私有静态变量以及一个公有静态函数来实现。  
![单例结构图](./pictures/singletonStructureDiagram.png)

### 如何实现
- 私有构造函数保证了不能通过构造函数来创建对象实例，只能通过公有静态函数返回唯一的私有静态变量。
---
## 实现方法

- [饿汉式](/src/main/java/designPatternCode/singleton/Mgr01.java)
```java
private final static Singleton uniqueInstance = new Singleton();
```
   - 优点：线程安全
   - 缺点：不管用到与否，类装载时就完成实例化
   - 关键：
     - 私有化构造方法
     - 公共静态方法
     - static final得创建实例
- [懒汉式](/src/main/java/designPatternCode/singleton/Mgr03.java)
```java
if (INSTANCE == null) {INSTANCE = new Mgr03();}
```
   - 优点：延迟加载，用到时才加载
   - 缺点：线程不安全
   - 关键：
     - 私有化构造方法
     - 公共静态方法
     - 实例若为空就创建实例
     
- [懒汉式-线程安全](/src/main/java/designPatternCode/singleton/Mgr03.java)
  - 关键：懒汉式基础上，对getInstance加synchronized关键字
  - 优点：解决线程安全性
  - 缺点：性能慢，串行    
注：线程问题发生条件  
1.多线程的环境下  
2.必须有共享资源  
3.对资源进行非原子性操作  
