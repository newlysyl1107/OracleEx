package sun.a.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sun.a.com.model.StaffVO;
import sun.a.com.service.SearchService;

@Controller
@RequestMapping(value="search")
public class SearchController {
	
	@Autowired
	SearchService service;
	
	
	
	@RequestMapping(value="searchPage")
	@ResponseBody
	public String searchPage() {
		
		
		
		return "search/main";
	}

	@RequestMapping(value="searchAll")
	public String searchAll(Model model) {
		
		List<StaffVO> list = service.searchAll();
		
		model.addAttribute("list", list);
		
		System.out.println("list = " + list);
		
		return "search/result";
	}
}








