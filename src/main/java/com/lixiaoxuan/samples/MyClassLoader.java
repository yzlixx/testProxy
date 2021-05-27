package com.lixiaoxuan.samples;

/**
 * @author lixiaoxuan
 * @description: 自定义一个类加载器，用于将字节码转换为class对象
 * @date 2021/5/21 18:21
 */
public class MyClassLoader extends ClassLoader {

    public Class<?> defineMyClass(byte[] b, int off, int len) {
        return super.defineClass(null, b, off, len);
    }
}
