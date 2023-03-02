package com.itnwe.Lab128.TableSpace.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.itnwe.Lab128.TableSpace.dto.TableSpaceLabelDto;

@Mapper
public interface TableSpaceLabelMapper {
	List<TableSpaceLabelDto> selectTableSpaceLabelList() throws Exception; 
}
