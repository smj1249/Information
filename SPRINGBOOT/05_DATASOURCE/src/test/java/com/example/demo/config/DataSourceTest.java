package com.example.demo.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DataSourceTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void t1() throws Exception{
        System.out.println(dataSource);
        Connection conn = dataSource.getConnection();
        PreparedStatement pstmt = conn.prepareStatement("insert into tbl_memo values(?,?,?,now())");
        pstmt.setInt(1,111);
        pstmt.setString(2,"ababababab");
        pstmt.setString(3,"springboot@test.com");
        pstmt.executeUpdate();
    }
}
