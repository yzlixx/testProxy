package com.lixiaoxuan.proxy.service.impl;

import com.lixiaoxuan.proxy.service.Rechargable;
import com.lixiaoxuan.proxy.service.Vehicle;

/**
 * @author lixiaoxuan
 * @description: 电能车类，实现Rechargable，Vehicle接口
 * @date 2021/5/26 13:30
 */
public class ElectricCar implements Vehicle, Rechargable {
    @Override
    public void recharge(String name) {
        System.out.println(name + " Electric Car is Recharging...");
    }

    @Override
    public void drive() {
        System.out.println("Electric Car is Moving silently...");
    }
}
