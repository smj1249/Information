package Ch38.Tests.Dao;

import java.sql.SQLException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import Ch38.Domain.Dao.BookDaoImpl;
import Ch38.Domain.Dao.UserDaoImpl;
import Ch38.Domain.Dto.BookDto;
import Ch38.Domain.Dto.UserDto;

class DaoTests {

	@Test
	@Disabled
	void test1() throws ClassNotFoundException, SQLException {
		
		UserDaoImpl userDaoImpl = UserDaoImpl.getInstance();
	}
	
	@Test
	@Disabled
	void test2() throws Exception {
		UserDaoImpl userDaoImpl = UserDaoImpl.getInstance();
		userDaoImpl.insert(new UserDto("aaa","홍길동","1234",""));
	}
	
	@Test
	
	void test3() throws Exception {
		BookDaoImpl bookDaoImpl = BookDaoImpl.getInstance();
		bookDaoImpl.insert(new BookDto("1111","리눅스다","한빛미디어","111-111"));
	}
	
	
	@Test
	@Disabled
	void test4() throws Exception {
		
	}
	
}
