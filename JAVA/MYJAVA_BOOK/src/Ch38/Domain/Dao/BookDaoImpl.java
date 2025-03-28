package Ch38.Domain.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Ch38.Domain.Dto.BookDto;
import Ch38.Domain.Dto.UserDto;

public class BookDaoImpl {
	//DB Attr
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String id="root";
	private String pw="1234";
	private String url="jdbc:mysql://localhost:3306/bookDB";
	
	//싱글톤
	
	private static BookDaoImpl instance;
	private BookDaoImpl() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("UserDaoImpl DB Connection Success");
	};
	public static BookDaoImpl getInstance() throws ClassNotFoundException, SQLException {
		if(instance==null)
			instance=new BookDaoImpl();
		return instance;
	}
	
	//CRUD 
	 
	public int insert(BookDto bookDto) throws SQLException {
		try {
			pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
			pstmt.setString(1, bookDto.getBookCode());
			pstmt.setString(2, bookDto.getBookName());
			pstmt.setString(3, bookDto.getPublisher());
			pstmt.setString(4, bookDto.getIsbn());
			return pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("BOOKDAO's INSERT SQL EXCEPTION!!");
		}finally {
			try {pstmt.close();}catch(Exception e2) {}
		}
	}
	
 
	public int update(UserDto userDto) throws SQLException {
		try {
			pstmt = conn.prepareStatement("");
			
			return pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("BOOKDAO's UPDATE SQL EXCEPTION!!");
		}finally {
			try {pstmt.close();}catch(Exception e2) {}
		}
	}
 
	public int delete(UserDto userDto) throws SQLException {
		try {
			pstmt = conn.prepareStatement("");
			
			return pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("BOOKDAO's DELETE SQL EXCEPTION!!");
		}finally {
			try {pstmt.close();}catch(Exception e2) {}
		}
	}
	//단건조회
 
	public UserDto select(UserDto userDto) {	
		return null;
	}
	//다건조회
 
	public List<UserDto> selectAll() {	
		return null;
	}	

}




