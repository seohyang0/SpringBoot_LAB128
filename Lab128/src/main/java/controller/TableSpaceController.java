package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import domain.TableSpaceDao;
import service.TableSpaceService;

@Controller
public class TableSpaceController {
	
	@Autowired
	private TableSpaceService s;
	
	@RequestMapping(value="/")
    public String index() {
		return "index";
    }
	
	/*@RequestMapping(value="/TableSpace", method=RequestMethod.GET)
	@ResponseBody //view가 아닌 객체정보 전달을 위해 사용
	public List<TableSpaceDao> TableSpace(){
		return s.getTableSpace();
	}*/
	
	@RequestMapping("/TableSpace")
	public String TableSpace() {
		return "TableSpace";
	}

}