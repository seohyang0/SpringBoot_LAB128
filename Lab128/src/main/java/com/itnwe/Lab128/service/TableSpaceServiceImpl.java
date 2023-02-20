package com.itnwe.Lab128.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itnwe.Lab128.dto.TableSpaceDto;
import com.itnwe.Lab128.mapper.TableSpaceMapper;


@Service //서비스임을 선언
public class TableSpaceServiceImpl implements TableSpaceService {

	@Autowired //Mapper와 연결
	private TableSpaceMapper TableSpaceMapper;	
	
	@Override
	public List<TableSpaceDto> selectTableSpaceList() throws Exception {
		// TODO Auto-generated method stub
		return TableSpaceMapper.selectTableSpaceList();
	}
		
}