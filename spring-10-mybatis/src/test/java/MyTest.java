import com.hello.mapper.UserMapper;
import com.hello.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MyTest {
    @Test
    public void test() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);//UserMapperImpl
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }
    @Test
    public void test2() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);//UserMapperImpl
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }
}
