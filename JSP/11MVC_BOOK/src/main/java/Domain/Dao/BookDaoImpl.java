package Domain.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import Domain.Dao.ConnectionPool.ConnectionItem;
import Domain.Dao.ConnectionPool.ConnectionPool;
import Domain.Dto.BookDto;
import Domain.Dto.UserDto;

public class BookDaoImpl implements BookDao {
	//DB Attr
//	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
//	private String id="root";
//	private String pw="1234";
//	private String url="jdbc:mysql://localhost:3306/bookDB";
	
	private ConnectionPool connectionPool;
	private ConnectionItem connectionItem;
	
	
	//싱글톤
	
	private static BookDao instance;
	private BookDaoImpl() throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		conn = DriverManager.getConnection(url,id,pw);
		connectionPool = ConnectionPool.getInstance();
		System.out.println("UserDaoImpl DB Connection Success");
		
	};
	public static BookDao getInstance() throws ClassNotFoundException, SQLException {
		if(instance==null)
			instance=new BookDaoImpl();
		return instance;
	}
	
	//CRUD 
	 
	@Override
	public int insert(BookDto bookDto) throws Exception {
		try {
			//connection  get
			connectionItem = connectionPool.getConnection();
			Connection conn = connectionItem.getConn();
			
			pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
			pstmt.setString(1, bookDto.getBookCode());
			pstmt.setString(2, bookDto.getBookName());
			pstmt.setString(3, bookDto.getPublisher());
			pstmt.setString(4, bookDto.getIsbn());
			
			//connection release
			connectionPool.releaseConnection(connectionItem);
			
			return pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("BOOKDAO's INSERT SQL EXCEPTION!!");
		}finally {
			try {pstmt.close();}catch(Exception e2) {}
		}
	}
	
 
	@Override
	public int update(UserDto userDto) throws SQLException {
		return 0;
	}
 
	@Override
	public int delete(UserDto userDto) throws SQLException {
		return 0;
	}
	//단건조회
 
	@Override
	public UserDto select(UserDto userDto) throws SQLException{	
		return null;
	}
	//다건조회
 
	@Override
	public List<BookDto> selectAll() throws Exception{
		List<BookDto> list = new LinkedList();
		BookDto dto = null;
		try {
			//connection  get
			connectionItem = connectionPool.getConnection();
			Connection conn = connectionItem.getConn();
			
			pstmt = conn.prepareStatement("select * from tbl_book");
			
			rs=pstmt.executeQuery();
			if(rs!=null) {
				
				while(rs.next()) {
					dto = new BookDto();
					dto.setBookCode(rs.getString(1));
					dto.setBookName(rs.getString(2));
					dto.setPublisher(rs.getString(3));
					dto.setIsbn(rs.getString(4));
					
					list.add(dto);
				}
			}
	
			return list;

				
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("BOOKDAO's SELECT SQL EXCEPTION!!");
		}finally {
			try {pstmt.close();}catch(Exception e2) {}
			//connection release
			connectionPool.releaseConnection(connectionItem);	
		}
	}
	@Override
	public List<BookDto> selectAll(int offset, int amount) throws Exception {
		List<BookDto> list = new LinkedList();
		BookDto dto = null;
		try {
			//connection  get
			connectionItem = connectionPool.getConnection();
			Connection conn = connectionItem.getConn();
			
			pstmt = conn.prepareStatement("select * from tbl_book order by bookCode desc limit ?,?");
			pstmt.setInt(1, offset);
			pstmt.setInt(2, amount);
			
			rs=pstmt.executeQuery();
			if(rs!=null) {
				
				while(rs.next()) {
					dto = new BookDto();
					dto.setBookCode(rs.getString(1));
					dto.setBookName(rs.getString(2));
					dto.setPublisher(rs.getString(3));
					dto.setIsbn(rs.getString(4));
					
					list.add(dto);
				}
			}
	
			return list;		
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("BOOKDAO's SELECT SQL EXCEPTION!!");
		}finally {
			try {pstmt.close();}catch(Exception e2) {}
			//connection release
			connectionPool.releaseConnection(connectionItem);	
		}
		
	}	
	@Override
	public long count() throws Exception{
		long count=0;
		try {
			//connection  get
			connectionItem = connectionPool.getConnection();
			Connection conn = connectionItem.getConn();
			
			pstmt = conn.prepareStatement("select count(*) from tbl_book");
			
			rs=pstmt.executeQuery();
			
			if(rs!=null&& rs.next())
				count = rs.getLong(1);
				
			return count;	
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("BOOKDAO's SELECT SQL EXCEPTION!!");
		}finally {
			try {pstmt.close();}catch(Exception e2) {}
			//connection release
			connectionPool.releaseConnection(connectionItem);	
		}
		
	}
}




