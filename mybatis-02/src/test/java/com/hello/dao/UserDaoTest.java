package com.hello.dao;

import com.hello.pojo.User;
import com.hello.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    private static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void test() {
        SqlSession sqlSession = null;
        try {
            //使用时，先获取Session
            sqlSession = MybatisUtils.getSqlSession();
            //其次，getMapper实例化接口
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();
            //List<User> userList = sqlSession.selectList("com.hello.dao.UserDao.getUserList");//老旧方法
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭session
            sqlSession.close();
        }
    }

    @Test
    public void getUserById() {
        logger.debug("This is debug message.");
        logger.info("This is info message.");
        logger.error("This is error message.");

        /*SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();*/
    }
}
