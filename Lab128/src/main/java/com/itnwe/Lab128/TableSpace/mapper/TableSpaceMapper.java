package com.itnwe.Lab128.TableSpace.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.itnwe.Lab128.TableSpace.dto.TableSpaceDto;

@Mapper	
public interface TableSpaceMapper {
	List<TableSpaceDto> selectTableSpaceList() throws Exception; 

}