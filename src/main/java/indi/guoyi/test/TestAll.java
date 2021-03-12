package indi.guoyi.test;

import indi.guoyi.dao.UserDao;
import indi.guoyi.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

public class TestAll {

//    private InputStream in;
//    private SqlSession sqlSession;
//    private UserDao userDao;
//
//    @Before//用于在测试方法执行之前执行
//    public void init()throws Exception{
//        //1.读取配置文件，生成字节输入流
//        in = Resources.getResourceAsStream("SqlMapConfig.xml");
//        //2.获取SqlSessionFactory
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//        //3.获取SqlSession对象
//        sqlSession = factory.openSession();
//        //4.获取dao的代理对象
//        userDao = sqlSession.getMapper(UserDao.class);
//    }
//
//    @After//用于在测试方法执行之后执行
//    public void destroy()throws Exception{
//        //提交事务
//        sqlSession.commit();
//        //6.释放资源
//        sqlSession.close();
//        in.close();
//    }

    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao ud = ac.getBean("ud",UserDao.class);
        //5.执行查询所有方法
        List<User> users = ud.findAll();
        for(User user : users){
            System.out.println(user);
        }

    }
}
