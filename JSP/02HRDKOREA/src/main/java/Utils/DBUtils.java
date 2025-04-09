package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {
	
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String id = "system";
	private String pw = "1234";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	
	//싱글톤 
	private static DBUtils instance;
	private DBUtils() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, id, pw);
	}
	public static DBUtils getInstance() throws Exception {
		if(instance==null)
			instance = new DBUtils();
		return instance;
	}
	
	// select m.m_name,p.p_name,m.p_school,m.m_jumin,m.m_city,p.p_tel1,p.p_tel2,p.p_tel3
	// from tbl_member_202005 m
	// join tbl_party_202005 p
	// on m.p_code=p.p_code;
	public List<MemberDto> selectAllMember() throws Exception{
		
		String sql="select m.m_no,m.m_name,p.p_name,m.p_school,m.m_jumin,m.m_city,p.p_tel1,p.p_tel2,p.p_tel3"
				+ " from tbl_member_202005 m"
				+ " join tbl_party_202005 p"
				+ " on m.p_code=p.p_code"
				;
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		List<MemberDto> list = new ArrayList<>();
		MemberDto dto = null;
		if(rs!=null) {
			while(rs.next()) {
				dto = new MemberDto();
				dto.setM_no(rs.getString(1));
				dto.setM_name(rs.getString(2));
				dto.setP_name(rs.getString(3));
				dto.setP_school(rs.getString(4));
				dto.setM_jumin(rs.getString(5));
				dto.setM_city(rs.getString(6));
				dto.setP_tel1(rs.getString(7));
				dto.setP_tel2(rs.getString(8));
				dto.setP_tel3(rs.getString(9));
				list.add(dto);
			}
		}
		pstmt.close();
		rs.close();
		return list;
	}
	
	public int insertVote(VoteDto dto) throws Exception {
		pstmt = conn.prepareStatement("insert into TBL_VOTE_202005 values(?,?,?,?,?,?)");
		pstmt.setString(1, dto.getV_jumin());
		pstmt.setString(2, dto.getV_name());
		pstmt.setString(3, dto.getM_no());
		pstmt.setString(4, dto.getV_time());
		pstmt.setString(5, dto.getV_area());
		pstmt.setString(6, dto.getV_confirm());
		
		int result = pstmt.executeUpdate();
		
		pstmt.close();
		return result;
	}
	
}


