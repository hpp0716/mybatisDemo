package com.hpp.demo.mybatisDemo;

import com.alibaba.fastjson.JSON;
import com.hpp.demo.mybatisDemo.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatis {
    private static SqlSessionFactory sqlSessionFactory;
 
    static {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
 
   
    private static User queryTable(int id) {
        SqlSession session = sqlSessionFactory.openSession();
        System.out.println(session);
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
	        User user = userMapper.selectByPrimaryKey(id);
	        User user1 = userMapper.selectByPrimaryKey(id);
	        //找到sql
	        //参数设置
	        //执行
	        //结果映射
            System.out.println("输出="+JSON.toJSONString(user));
            return user;
        } finally {
            session.close();
        }
    }

    public static void main(String[] args) {
	    User dd = queryTable(3);
        System.out.println("输出="+JSON.toJSONString(dd));

    }
    
}
