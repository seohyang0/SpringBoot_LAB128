package com.itnwe.Lab128.TableSpace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itnwe.Lab128.TableSpace.dto.TableSpaceLabelDto;
import com.itnwe.Lab128.TableSpace.mapper.TableSpaceLabelMapper;

@Service
public class TableSpaceLabelServiceImpl implements TableSpaceLabelService {

	@Autowired
	private TableSpaceLabelMapper TableSpaceLabelMapper;
	
	@Override
	public List<TableSpaceLabelDto> selectTableSpaceLabelList() throws Exception {
		return TableSpaceLabelMapper.selectTableSpaceLabelList();
	}
}
