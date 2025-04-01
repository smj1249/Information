package Ch38.Domain.Service;

import java.sql.SQLException;

import Ch38.Domain.Dao.UserDao;
import Ch38.Domain.Dao.UserDaoImpl;
import Ch38.Domain.Dao.ConnectionPool.ConnectionPool;
import Ch38.Domain.Dto.UserDto;

public class UserServiceImpl {

	//
	private UserDao userDao;
	private ConnectionPool connectionPool;

	// 싱글톤 패턴
	private static UserServiceImpl instance;

	private UserServiceImpl() throws ClassNotFoundException, SQLException {
		userDao = UserDaoImpl.getInstance();
		connectionPool = ConnectionPool.getInstance();
		System.out.println("[SERVICE] UserServiceImpl init...");
	};

	public static UserServiceImpl getInstance() throws ClassNotFoundException, SQLException {
		if (instance == null)
			instance = new UserServiceImpl();
		return instance;
	}

	// 회원가입(+TX처리필요)
	public boolean userJoin(UserDto userDto) throws Exception {
		boolean isJoin = false;
		try {
			connectionPool.beginTransaction();
			
			isJoin = userDao.insert(userDto)>0;	// sql 질의 다수
//			userDao.insert(new UserDto("aaaaa","","",""));
//			userDao.insert(new UserDto("aaaaa","","",""));
//			userDao.insert(new UserDto("aaaaa","","",""));	// PK 중복 오류!
			
//			connectionPool.commitTransaction();
			
		} catch (SQLException e) {
//			connectionPool.rollbackTransaction();
		}
		return true;

	};

	// 회원조회

	// 회원정보수정

	// 회원탈퇴

	// 로그인

	// 로그아웃

}
