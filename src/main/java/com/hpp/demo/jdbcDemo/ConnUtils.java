package com.hpp.demo.jdbcDemo;

import com.alibaba.fastjson.JSON;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnUtils {

    private ConnUtils() {
    }

    private static Connection con;

    //在静态代码块中创建与数据库的连接
    static {
        try {
            //postgresql驱动名称
            Class.forName("com.mysql.jdbc.Driver");
            //数据库连接路径
            String url = "jdbc:mysql://127.0.0.1:3306/test?";
            //用户名和密码
            con = DriverManager.getConnection(url,"hpp","123456");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    //使用一个静态方法－静态工厂方法，返回connection实例
    public static Connection getCon() {
        return con;
    }

    //main函数测试用
    public static void main(String[] args) throws SQLException {

        Connection con = getCon();
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("select * from user");
        List<String> list = new ArrayList<>();
        while(rs.next()){
            String string = rs.getString(1);
            list.add(string);
        }
        con.close();

        System.out.println(JSON.toJSONString(list));
        System.out.println(list.size());

    }
}
