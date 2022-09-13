package com.sam.uvb76.book.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Starter {

    public static void main(String[] args) throws IOException {

        String resource = "mybatisConf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        System.out.println("wwwwwww");
        try (SqlSession session = sqlSessionFactory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            User user = mapper.selectUser(1);
//            User user = (User) session.selectOne("com.sam.uvb76.book.mybatis.UserMapper.selectUser", 1);
            System.out.println(user.getName());

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
