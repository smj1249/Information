package Ch38.Domain.Service;

import java.sql.SQLException;

import Ch38.Domain.Dao.BookDaoImpl;
import Ch38.Domain.Dto.BookDto;

public class BookServiceImpl {
	//
	private BookDaoImpl bookDao;
	
	//싱글톤 패턴
	private static BookServiceImpl instance;
	private BookServiceImpl() throws Exception {
		bookDao = BookDaoImpl.getInstance();
	}
	public static BookServiceImpl getInstance() throws Exception {
		if(instance == null)
			instance = new BookServiceImpl();
		return instance;
	}
	//TX 처리 + 비즈니스 유효성검사
	public boolean bookRegistration(BookDto bookDto) throws SQLException {
		return bookDao.insert(bookDto)>0;
	}
	
}
