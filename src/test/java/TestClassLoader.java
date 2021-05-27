import com.lixiaoxuan.samples.MyClassLoader;
import org.junit.Test;

import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;

/**
 * @author lixiaoxuan
 * @description: TODO
 * @date 2021/5/21 18:26
 */
public class TestClassLoader {




    @Test
    public void testClassLoader() throws Exception {
        FileInputStream input = new FileInputStream("target/classes/com/lixiaoxuan/samples/Programmer2.class/com/lixiaoxuan/samples/Programmer2.class");

        byte[] result = new byte[1024];

        int count = input.read(result);
        // 使用自定义的类加载器将 byte字节码数组转换为对应的class对象
        MyClassLoader loader = new MyClassLoader();
        Class clazz = loader.defineMyClass( result, 0, count);
        //测试加载是否成功，打印class 对象的名称
        System.out.println(clazz.getCanonicalName());

        //实例化一个Programmer对象
        Object o= clazz.newInstance();
        try {
            //调用Programmer的code方法
            clazz.getMethod("code", null).invoke(o, null);
        } catch (IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
    }
}
