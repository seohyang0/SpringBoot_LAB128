package com.itnwe.Lab128.TableSpace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.itnwe.Lab128.TableSpace.dto.TableSpaceDto;
import com.itnwe.Lab128.TableSpace.service.TableSpaceService;

@Controller //컨트롤러 선언
public class TableSpaceController {
	
	@Autowired
	private TableSpaceService TableSpaceService;
	
	@RequestMapping("/")
    public String index() {
		return "index";
    }
	
	
	//TableSpace 목록 조회를 위해 ServiceImpl 클래스와 selectBoardList 메서드 호출
	@RequestMapping(value="/TableSpace", method=RequestMethod.GET)
	@ResponseBody //view가 아닌 객체정보 전달을 위해 사용
	public ModelAndView openBoardList() throws Exception{

		ModelAndView mv = new ModelAndView("TableSpace"); //templates 폴더 아래의 /TableSpace.html 호출
		
		List<TableSpaceDto> list = TableSpaceService.selectTableSpaceList();
		mv.addObject("list", list);
		
		return mv;
	}
	
	
	
	
}