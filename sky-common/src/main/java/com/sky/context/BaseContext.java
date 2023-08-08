package com.sky.context;

public class BaseContext {

    // 也可以理解为一个类的静态属性，直接用set和get方法取，只不过作用域在一个线程里
    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }

    public static void removeCurrentId() {
        threadLocal.remove();
    }

}
