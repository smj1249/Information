package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;

public class MysqlDbUtils {
	
	private String url = "jdbc:mysql://localhost/testDB";
	private String id = "root";
	private String pw = "1234";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;	
	
	// DataSource Resource 연결
	private DataSource dataSource;
	
	// 싱글톤
	private staticMysqlDbUtils instance;
	
	private MysqlDbUtils() throws Exception {
		Context initContext = new InitialContext();
		Context envContext = (Context)initContext.lookup("java:/comp/env");
		dataSource = (DataSource)envContext.lookup("jdbc/MysqlDB");
		conn = dataSource.getConnection();
		System.out.println("Connection : " + conn);
	}
	
	

}







