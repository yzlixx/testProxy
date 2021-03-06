package com.lixiaoxuan.proxy;

import com.lixiaoxuan.proxy.interceptor.Hacker;
import com.lixiaoxuan.samples.Programmer;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author lixiaoxuan
 * @description: TODO
 * @date 2021/5/26 17:03
 */
public class CglibProxy {
    public static void main(String[] args) {
        Programmer progammer = new Programmer();

        Hacker hacker = new Hacker();
        //cglib 中加强器，用来创建动态代理
        Enhancer enhancer = new Enhancer();
        //设置要创建动态代理的类
        enhancer.setSuperclass(progammer.getClass());
        // 设置回调，这里相当于是对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实行intercept()方法进行拦截
        enhancer.setCallback(hacker);
        Programmer proxy =(Programmer)enhancer.create();
        proxy.code();

    }
}
