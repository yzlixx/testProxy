package com.lixiaoxuan.samples;

import javassist.*;

import java.io.IOException;

/**
 * @author lixiaoxuan
 * @description: Javassist 动态生成类
 * @date 2021/5/25 19:02
 */
public class MyGeneratorJavassist {

    public static void main(String[] args) throws CannotCompileException, IOException {
        ClassPool pool = ClassPool.getDefault();
        //创建Programmer类
        CtClass cc = pool.makeClass("Programmer2");
        //定义code方法
        CtMethod method = CtNewMethod.make("public void code(){}", cc);
        //插入方法代码
        method.insertBefore("System.out.println(\"I'm a Programmer2,Just Coding.....\");");
        cc.addMethod(method);
        cc.writeFile("target/classes/com/lixiaoxuan/samples/Programmer");

    }
}
