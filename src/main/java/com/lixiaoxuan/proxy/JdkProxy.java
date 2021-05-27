package com.lixiaoxuan.proxy;

import com.lixiaoxuan.proxy.service.Rechargable;
import com.lixiaoxuan.proxy.service.Vehicle;
import com.lixiaoxuan.proxy.service.impl.ElectricCar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lixiaoxuan
 * @description: jdk动态代理
 * @date 2021/5/26 13:26
 */
public class JdkProxy {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        //获取类加载器
        ClassLoader classLoader = electricCar.getClass().getClassLoader();
        //获取所有实现的接口
        Class<?>[] interfaces = electricCar.getClass().getInterfaces();

        Object o = Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("You are going to invoke "+method.getName()+" ...");
                method.invoke(electricCar, args);
                System.out.println(method.getName()+" invocation Has Been finished...");
                return null;
            }
        });
        Vehicle vehicle = (Vehicle) o;
        vehicle.drive();
        Rechargable rechargable = (Rechargable) o;
        rechargable.recharge("lixiaoxuan");

        ProxyUtil.generateClassFile(electricCar.getClass(),"ElectricCarProxy");

    }

}
