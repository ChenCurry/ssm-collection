package com.hello.dao;

import com.hello.pojo.User;
import com.hello.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession = null;
        try {
            //使用时，先获取Session
            sqlSession = MybatisUtils.getSqlSession();
            //其次，getMapper实例化接口
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();
            //List<User> userList = sqlSession.selectList("com.com.hello.com.hello.dao.UserDao.getUserList");//老旧方法
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭session
            if (null != sqlSession) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int ss = mapper.addUser(new User(5, "哈哈", "123333"));
        if (ss > 0) {
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addUser2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userid", "6");
        map.put("username", "zjl");
        map.put("password", "121211");
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int ss = mapper.addUser2(map);
        if (ss > 0) {
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int ss = mapper.updateUser(new User(5, "哈哈5", "125555"));
        if (ss > 0) {
            System.out.println("更新成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int ss = mapper.deleteUser(4);
        if (ss > 0) {
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
