package CH21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class ChargeStation {
	private int no;
	private String section;
	private String station;
	private String name;
	private int zipcode;
	private String address;

	// Getter and Setter
	// toString
	// 모든 인자 생성자
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ChargeStation(int no, String section, String station, String name, int zipcode, String address) {
		super();
		this.no = no;
		this.section = section;
		this.station = station;
		this.name = name;
		this.zipcode = zipcode;
		this.address = address;
	}

	@Override
	public String toString() {
		return "ChargeStation [no=" + no + ", section=" + section + ", station=" + station + ", name=" + name
				+ ", zipcode=" + zipcode + ", address=" + address + "]";
	}

}

public class C06Ex {
	// DB CONN DATA
	static String id = "root";
	static String pw = "1234";
	static String url = "jdbc:mysql://localhost:3306/testdb";

	// JDBC참조변수
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	public static void connect() throws Exception {
		// DB 연결코드
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loading Success...");
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("DB CONNECTED...");
	}

	public static void Select() throws Exception {
		// 전체 조회
		//SQL 준비
		pstmt = conn.prepareStatement("select * from charge_station");
		
	
		//SQL 실행
		rs =  pstmt.executeQuery();
		if(rs!=null) {
			while(rs.next()) {
				System.out.print(rs.getInt("순번")+ " ");
				System.out.print(rs.getString("행정구역")+ "\t");
				System.out.print(rs.getString("지사")+ "\t");
				System.out.print(rs.getString("시설명")+ "\t");
				System.out.print(rs.getString("우편번호")+ "\t");
				System.out.print(rs.getString("주소")+ "\n");
			}
		}
		freeConnection(pstmt,rs);
	}

	public static void Insert(ChargeStation obj) throws Exception {
		// ChargeStation 객체를 받아 내용 insert
		pstmt = conn.prepareStatement("insert into charge_station values(?,?,?,?,?,?)");
		pstmt.setInt(1, obj.getNo());
		pstmt.setString(2, obj.getSection());
		pstmt.setString(3, obj.getStation());
		pstmt.setString(4, obj.getName());
		pstmt.setInt(5, obj.getZipcode());
		pstmt.setString(6, obj.getAddress());

		int result = pstmt.executeUpdate();
		if (result > 0)
			System.out.println("[INFO] INSERT 성공!");
		else
			System.out.println("[ERROR] INSERT 실패!");
		
		freeConnection(pstmt);
	}

	public static void Update() throws Exception {
		// 수정
		pstmt = conn.prepareStatement("update charge_station set '행정구역'=?,"
				+"'지사'=?,'시설명='?,'우편번호'=?'주소'=? where '순번'=?");
		
		pstmt.setString(1, null);
		pstmt.setString(2, null);
		pstmt.setString(3, null);
		pstmt.setINT(4, null);
		pstmt.setString(5, null);
		pstmt.setString(6, null);
		
		int result = pstmt.executeUpdate();
		
		if(result>0)
			System.out.println("[INFO] UPDATE 성공!");
		else
			System.out.println("[INFO] UPDATE 실패!");
		
		freeConnection(pstmt);
	}

	public static void Delete(int no) throws Exception {
	    // 삭제 SQL 준비
	    String sql = "DELETE FROM charge_station WHERE no = ?";
	    pstmt = conn.prepareStatement(sql);
	    pstmt.setInt(1, no);

	    // SQL 실행
	    int result = pstmt.executeUpdate();
	    if (result > 0)
	        System.out.println("[INFO] DELETE 성공!");
	    else
	        System.out.println("[ERROR] DELETE 실패! (해당 데이터 없음)");

	    // 자원 해제
	    freeConnection(pstmt);
	}


	// 자원제거용 함수 오버로딩
	public static void freeConnection(Connection conn) throws Exception {
	}

	public static void freeConnection(PreparedStatement pstmt) throws Exception {
		pstmt.close();
	}

	public static void freeConnection(PreparedStatement pstmt, ResultSet rs) throws Exception {
		pstmt.close();
		rs.close();
	}

	public static void main(String[] args) throws Exception {
		try {
			connect();
//			Insert(new ChargeStation(201, "대구광역시", "대구지사", "대구가스", 10101, "대구"));
			
			Select();		//전체조회
//			SelectOne();	//단건조회
			Update(new ChargeStation(201, "울산광역시", "울산지사","울산가스", 20202, "울산"));		//수정
			Delete(1);		//단건삭제
//			

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			freeConnection(conn);
		}

	}

}