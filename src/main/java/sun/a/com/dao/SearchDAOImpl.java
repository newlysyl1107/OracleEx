package sun.a.com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sun.a.com.model.StaffVO;

@Repository
public class SearchDAOImpl implements SearchDAO {

	@Autowired
	SqlSession session;
	
	String nameSpace = "search.";

	@Override
	public List<StaffVO> searchAll() {
		return session.selectList(nameSpace + "showAll");
	}
	
}
