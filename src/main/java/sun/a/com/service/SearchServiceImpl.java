package sun.a.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sun.a.com.dao.SearchDAO;
import sun.a.com.model.StaffVO;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	SearchDAO dao;
	
	@Override
	public List<StaffVO> searchAll() {
		return dao.searchAll();
	}

}
